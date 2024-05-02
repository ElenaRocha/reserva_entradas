package com.example.reserva_entradas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.dto.TeatroDTO;
import com.example.reserva_entradas.model.Teatro;
import com.example.reserva_entradas.service.TeatroService;

@RestController
@RequestMapping("/teatro")
public class TeatroController {
    
    @Autowired
    private TeatroService teatroService;

    @GetMapping
    public List<TeatroDTO> getAllTeatros() {
        List<Teatro> teatros = teatroService.getAllTeatros();
        return teatros.stream()
            .map(this::convertirTeatroDTO)
            .collect(Collectors.toList());
    }

    @GetMapping("/{idteatro}")
    public TeatroDTO getTeatroById(@PathVariable Long idteatro) {
        return teatroService.getTeatroById(idteatro)
            .map(this::convertirTeatroDTO)
            .orElse(null);
    }

    @PostMapping
    public TeatroDTO saveTeatroDTO(@RequestBody TeatroDTO teatroDTO) {
        Teatro teatro = convertirTeatroEntidad(teatroDTO);
        Teatro savedTeatro = teatroService.saveTeatro(teatro);
        return convertirTeatroDTO(savedTeatro);
    }

    @DeleteMapping("/{idteatro}")
    public void deleteTeatro(@PathVariable Long idteatro) {
        teatroService.deleteTeatro(idteatro);
    }

    private TeatroDTO convertirTeatroDTO(Teatro teatro) {
        TeatroDTO teatroDTO = new TeatroDTO();
        teatroDTO.setIdteatro(teatro.getIdTeatro());
        teatroDTO.setNombre(teatro.getNombre());
        teatroDTO.setPresentacion(teatro.getPresentacion());
        return teatroDTO;
    }

    private Teatro convertirTeatroEntidad(TeatroDTO teatroDTO) {
        Teatro teatro = new Teatro();
        teatro.setIdTeatro(teatroDTO.getIdteatro());
        teatro.setNombre(teatroDTO.getNombre());
        teatro.setPresentacion(teatroDTO.getPresentacion());
        return teatro;
    }

}
