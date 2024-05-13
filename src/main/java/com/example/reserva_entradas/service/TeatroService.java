package com.example.reserva_entradas.service;

import java.util.List;
import java.util.NoSuchElementException;
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

    public Teatro updateTeatro(Long idteatro, Teatro teatro){
        Teatro teatroExistente = teatroRepository.findById(idteatro)
            .orElseThrow(() -> new NoSuchElementException("Teatro no encontrado"));
        
        teatroExistente.setNombre(teatro.getNombre());
        teatroExistente.setPresentacion(teatro.getPresentacion());

        return teatroRepository.save(teatroExistente);
        
    }

    public void deleteTeatro(Long idteatro){
        Teatro teatroExistente = teatroRepository.findById(idteatro)
            .orElseThrow(() -> new NoSuchElementException("Teatro no encontrado"));

        teatroRepository.delete(teatroExistente);
    }
}
