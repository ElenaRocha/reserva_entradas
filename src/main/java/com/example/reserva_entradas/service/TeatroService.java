package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Teatro;
import com.example.reserva_entradas.repository.TeatroRepository;

@Service
public class TeatroService {
    private final TeatroRepository teatroRepository;

    @Autowired
    public TeatroService(TeatroRepository teatroRepository){
        this.teatroRepository = teatroRepository;
    }

    public List<Teatro> getAllTeatros(){
        return teatroRepository.findAll();
    }

    public Optional<Teatro> getTeatroById(Long idteatro){
        return teatroRepository.findById(idteatro);
    }

    public Teatro saveTeatro(Teatro teatro){
        return teatroRepository.save(teatro);
    }

    public void deleteTeatro(Long idteatro){
        teatroRepository.deleteById(idteatro);
    }
}
