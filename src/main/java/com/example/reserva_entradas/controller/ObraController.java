package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.service.ObraService;

@Controller
public class ObraController {
    private final ObraService obraService;

    @Autowired
    public ObraController(ObraService obraService){
        this.obraService = obraService;
    }

    @GetMapping("/obras")
    public String getAllObras(Model model){
        try {
            List<Obra> obras = obraService.getAllObras();
            model.addAttribute("obrasParaFront", obras);
            return "obrasTemplate";
        } catch (Exception e) {
            return "Error al mostrar las obras" + e.getMessage();
        }
    }

    //TODO: get obra by id

    //TODO: get obra by teatro

    @PostMapping("/guardarobra")
    public String saveObra(@ModelAttribute Obra obra){
        obraService.saveObra(obra);
        return "redirect:/obras";
    }

    @PostMapping("/actualizarobra")
    public String updateObra(@ModelAttribute Obra obra){
        obraService.updateObra(obra.getIdObra(), obra);
        return "redirect:/obras";
    }

    @PostMapping("/eliminarobra")
    public String eliminarObra(@ModelAttribute Long idobra){
        obraService.deleteObra(idobra);
        return "redirect:/obras";
    }
}

//ejemplo de un controlador usando DTO
//import com.example.reserva_entradas.dto.ObraDTO;

// @RestController
// @RequestMapping("/cartelera/obras")
// public class ObraController {

//     @Autowired
//     private ObraService obraService;

//     @GetMapping
//     public List<ObraDTO> getAllObras() {
//         List<Obra> obras = obraService.getAllObras();
//         return obras.stream().map(this::convertirObraDto).collect(Collectors.toList());
//     }

//     @GetMapping("/{idobra}")
//     public ObraDTO getObraById(@PathVariable Long idobra) {
//         return obraService.getObraById(idobra).map(this::convertirObraDto).orElse(null);
//     }

//     @GetMapping("/teatro/{idteatro}")
//     public List<ObraDTO> getObraByTeatro(@PathVariable Long idteatro) {
//         List<Obra> obras = obraService.getObraByTeatro(idteatro);
//         return obras.stream().map(this::convertirObraDto).collect(Collectors.toList());
//     }

//     @PostMapping
//     public ObraDTO saveObraDTO(@RequestBody ObraDTO obraDTO) {
//         Obra obra = convertirObraEntidad(obraDTO);
//         Obra savedObra = obraService.saveObra(obra);
//         return convertirObraDto(savedObra);
//     }

//     @DeleteMapping("/{idobra}")
//     public void deleteObra(@PathVariable Long idobra) {
//         obraService.deleteObra(idobra);
//     }

//     private ObraDTO convertirObraDto(Obra obra) {
//         ObraDTO obraDto = new ObraDTO();
//         obraDto.setIdobra(obra.getIdObra());
//         obraDto.setTitulo(obra.getTitulo());
//         obraDto.setAutor(obra.getAutor());
//         obraDto.setSinopsis(obra.getSinopsis());
//         obraDto.setDuracion_min(obra.getDuracion_min());
//         obraDto.setTeatro(obra.getTeatro());
//         return obraDto;
//     }

//     private Obra convertirObraEntidad(ObraDTO obraDTO) {
//         Obra obra = new Obra();
//         obra.setIdObra(obraDTO.getIdobra());
//         obra.setTitulo(obraDTO.getTitulo());
//         obra.setAutor(obraDTO.getAutor());
//         obra.setSinopsis(obraDTO.getSinopsis());
//         obra.setDuracion_min(obraDTO.getDuracion_min());
//         obra.setTeatro(obraDTO.getTeatro());
//         return obra;
//     }
    
// }
