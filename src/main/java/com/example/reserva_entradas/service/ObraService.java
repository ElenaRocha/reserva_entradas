package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import com.example.reserva_entradas.model.Obra;

public interface ObraService {
    List<Obra> getAllObras();

    Optional<Obra> getObraById(Long idobra);

    List<Obra> getObraByTeatro(Long teatro_id);

    Obra saveObra(Obra obra);

    void deleteObra(Long idobra);
}
