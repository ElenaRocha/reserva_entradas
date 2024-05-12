package com.example.reserva_entradas.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.model.Pase;
import com.example.reserva_entradas.repository.PaseRepository;

@Service
public class PaseService {
    private final PaseRepository paseRepository;

    @Autowired
    public PaseService(PaseRepository paseRepository){
        this.paseRepository = paseRepository;
    }

    public List<Pase> getAllPases(){
        return paseRepository.findAll();
    }

    public Optional<Pase> getPaseById(Long idpase){
        return paseRepository.findById(idpase);
    }

    public List<Pase> getPaseByObra(Long idobra){
        return paseRepository.findByObraId(idobra);
    }

    public Pase savePase(Pase pase){
        return paseRepository.save(pase);
    }

    public Pase updatePase(Long idpase, Pase pase){
        Pase paseExistente = paseRepository.findById(idpase)
            .orElseThrow(() -> new NoSuchElementException("Pase no encontrado"));
        
        paseExistente.setDia(pase.getDia());
        paseExistente.setHora(pase.getHora());
        paseExistente.setPrecio(pase.getPrecio());
        paseExistente.setObra(pase.getObra());

        return paseRepository.save(paseExistente);
        
    }

    public void deletePase(Long idpase){
        paseRepository.deleteById(idpase);
    }
}
