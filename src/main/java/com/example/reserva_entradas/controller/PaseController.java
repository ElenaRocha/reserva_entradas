package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.dto.PaseDTO;
import com.example.reserva_entradas.model.Pase;
import com.example.reserva_entradas.service.PaseService;

@RestController
@RequestMapping("/cartelera/pases")
public class PaseController {
    
    @Autowired
    private PaseService paseService;

    private PaseDTO convertirPaseDto(Pase pase) {
        PaseDTO paseDTO = new PaseDTO();
        paseDTO.setIdpase(pase.getIdPase());
        paseDTO.setDia(pase.getDia());
        paseDTO.setHora(pase.getHora());
        paseDTO.setPrecio(pase.getPrecio());
        paseDTO.setObra(pase.getObra());
        return paseDTO;
    }

    private Pase convertirPaseEntidad(PaseDTO paseDTO) {
        Pase pase = new Pase();
        pase.setIdPase(paseDTO.getIdpase());
        pase.setDia(paseDTO.getDia());
        pase.setHora(paseDTO.getHora());
        pase.setPrecio(paseDTO.getPrecio());
        pase.setObra(paseDTO.getObra());
        return pase;
    }

}
