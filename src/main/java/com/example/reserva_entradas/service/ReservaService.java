package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import com.example.reserva_entradas.model.Reserva;

public interface ReservaService {
    List<Reserva> getAllReservas();

    Optional<Reserva> getReservaById(Long idreserva);

    List<Reserva> getReservaByUsuario(Long usuario_id);

    List<Reserva> getReservaByPase(Long pase_id);

    Reserva saveReserva(Reserva reserva);

    void deleteReserva(Long idreserva);
}
