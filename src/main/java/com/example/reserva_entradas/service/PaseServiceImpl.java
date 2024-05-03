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
        return paseRepository.findAll();
    }

    @Override
    public Optional<Pase> getPaseById(Long idpase) {
        return paseRepository.findById(idpase);
    }

    @Override
    public List<Pase> getPaseByObra(Long obra_id) {
        return paseRepository.findByObraId(obra_id);
    }

    @Override
    public Pase savePase(Pase pase) {
        return paseRepository.save(pase);
    }

    @Override
    public void deletePase(Long idpase) {
        paseRepository.deleteById(idpase);
    }
    
}
