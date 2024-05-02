package com.example.reserva_entradas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.dto.ObraDTO;
import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.model.Teatro;
import com.example.reserva_entradas.service.ObraService;

@RestController
@RequestMapping("/cartelera/obras")
public class ObraController {

    @Autowired
    private ObraService obraService;

    @GetMapping
    public List<ObraDTO> getAllObras() {
        List<Obra> obras = obraService.getAllObras();
        return obras.stream()
            .map(this::convertirObraDto)
            .collect(Collectors.toList());
    };

    @GetMapping("/{idobra}")
    public ObraDTO getObraById(@PathVariable Long idobra) {
        return obraService.getObraById(idobra)
            .map(this::convertirObraDto)
            .orElse(null);
    };

    @GetMapping("/teatro/{idteatro}")
    public List<ObraDTO> getObraByTeatro(@PathVariable Long idteatro) {
        List<Obra> obras = obraService.getObraByTeatro(idteatro);
        return obras.stream()
            .map(this::convertirObraDto)
            .collect(Collectors.toList());
    }

    private ObraDTO convertirObraDto(Obra obra) {
        ObraDTO obraDto = new ObraDTO();
        obraDto.setIdobra(obra.getIdObra());
        obraDto.setTitulo(obra.getTitulo());
        obraDto.setAutor(obra.getAutor());
        obraDto.setSinopsis(obra.getSinopsis());
        obraDto.setDuracion_min(obra.getDuracion_min());
        obraDto.setTeatro(obra.getTeatro());
        return obraDto;
    }

    private Obra convertirObraEntidad(ObraDTO obraDTO) {
        Obra obra = new Obra();
        obra.setIdObra(obraDTO.getIdobra());
        obra.setTitulo(obraDTO.getTitulo());
        obra.setAutor(obraDTO.getAutor());
        obra.setSinopsis(obraDTO.getSinopsis());
        obra.setDuracion_min(obraDTO.getDuracion_min());
        obra.setTeatro(obraDTO.getTeatro());
        return obra;
    }
    
}
