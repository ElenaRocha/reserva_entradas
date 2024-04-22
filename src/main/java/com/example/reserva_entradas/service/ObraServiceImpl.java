package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.repository.ObraRepository;

@Service
public class ObraServiceImpl implements ObraService{

    @Autowired
    private ObraRepository obraRepository;

    @Override
    public List<Obra> getAllObras() {
        return obraRepository.findAll();
    }

    @Override
    public Optional<Obra> getObraById(Long idobra) {
        return obraRepository.findById(idobra);
    }

    @Override
    public List<Obra> getObraByTeatro(Long teatro_id) {
        
    }

    @Override
    public Obra saveObra(Obra obra) {
        
    }

    @Override
    public void deleteObra(Long idobra) {
        
    }
    
}
