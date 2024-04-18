package com.example.reserva_entradas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.repository.ObraRepository;

public class ObraService {
    private final ObraRepository obraRepository;

    @Autowired
    public ObraService(ObraRepository obraRepository){
        this.obraRepository = obraRepository;
    }

    public List<Obra> listarObras(){
        return Obra.findAll();
    };
}
