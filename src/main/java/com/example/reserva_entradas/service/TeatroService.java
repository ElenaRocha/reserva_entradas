package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import com.example.reserva_entradas.model.Teatro;

public interface TeatroService {
    List<Teatro> getAllTeatros();

    Optional<Teatro> getTeatroById(Long idteatro);

    Teatro saveTeatro(Teatro teatro);

    void deleteTeatro(Long idteatro);
}
