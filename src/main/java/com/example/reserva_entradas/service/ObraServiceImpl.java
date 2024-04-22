package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Obra;

@Service
public class ObraServiceImpl implements ObraService{

    @Override
    public List<Obra> getAllObras() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllObras'");
    }

    @Override
    public Optional<Obra> getObraById(Long idobra) {
        throw new UnsupportedOperationException("Unimplemented method 'getObraById'");
    }

    @Override
    public List<Obra> getObraByTeatro(Long teatro_id) {
        throw new UnsupportedOperationException("Unimplemented method 'getObraByTeatro'");
    }

    @Override
    public Obra saveObra(Obra obra) {
        throw new UnsupportedOperationException("Unimplemented method 'saveObra'");
    }

    @Override
    public void deleteObra(Long idobra) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteObra'");
    }
    
}
