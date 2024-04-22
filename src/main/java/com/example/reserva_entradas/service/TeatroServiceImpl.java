package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Teatro;
import com.example.reserva_entradas.repository.TeatroRepository;

@Service
public class TeatroServiceImpl implements TeatroService{

    @Autowired
    private TeatroRepository teatroRepository;

    @Override
    public List<Teatro> getAllTeatros() {
        return teatroRepository.findAll();
    }

    @Override
    public Optional<Teatro> getTeatroById(Long idteatro) {
        return teatroRepository.findById(idteatro);
    }

    @Override
    public Teatro saveTeatro(Teatro teatro) {
        
    }

    @Override
    public void deleteTeatro(Long idteatro) {
        
    }
    
}
