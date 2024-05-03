package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import com.example.reserva_entradas.model.Pase;

public interface PaseService {
    List<Pase> getAllPases();

    Optional<Pase> getPaseById(Long idpase);

    List<Pase> getPaseByObra(Long obra_id);

    Pase savePase(Pase pase);

    void deletePase(Long idpase);
}
