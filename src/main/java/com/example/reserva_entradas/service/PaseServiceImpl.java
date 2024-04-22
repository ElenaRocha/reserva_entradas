package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Pase;
import com.example.reserva_entradas.repository.PaseRepository;

@Service
public class PaseServiceImpl implements PaseService{

    @Autowired
    private PaseRepository paseRepository;

    @Override
    public List<Pase> getAllPases() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllPases'");
    }

    @Override
    public Optional<Pase> getPaseById(Long idpase) {
        throw new UnsupportedOperationException("Unimplemented method 'getPaseById'");
    }

    @Override
    public List<Pase> getPaseByObra(Long obra_id) {
        throw new UnsupportedOperationException("Unimplemented method 'getPaseByObra'");
    }

    @Override
    public Pase savePase(Pase pase) {
        throw new UnsupportedOperationException("Unimplemented method 'savePase'");
    }

    @Override
    public void deletePase(Long idpase) {
        throw new UnsupportedOperationException("Unimplemented method 'deletePase'");
    }
    
}
