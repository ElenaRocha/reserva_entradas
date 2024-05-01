package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
