package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
    
}
