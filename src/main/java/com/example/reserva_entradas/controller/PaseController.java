package com.example.reserva_entradas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping
    public List<PaseDTO> getAllPases() {
        List<Pase> pases = paseService.getAllPases();
        return pases.stream()
            .map(this::convertirPaseDto)
            .collect(Collectors.toList());
    };

    @GetMapping("/{idpase}")
    public PaseDTO getPaseById(@PathVariable Long idpase) {
        return paseService.getPaseById(idpase)
            .map(this::convertirPaseDto)
            .orElse(null);
    };

    @GetMapping("/obra/{idobra}")
    public List<PaseDTO> getPaseByObra(@PathVariable Long idobra) {
        List<Pase> pases = paseService.getPaseByObra(idobra);
        return pases.stream()
            .map(this::convertirPaseDto)
            .collect(Collectors.toList());
    };

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
