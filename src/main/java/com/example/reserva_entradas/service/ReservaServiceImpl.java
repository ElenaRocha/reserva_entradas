package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Reserva;
import com.example.reserva_entradas.repository.ReservaRepository;

@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> getAllReservas() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllReservas'");
    }

    @Override
    public Optional<Reserva> getReservaById(Long idreserva) {
        throw new UnsupportedOperationException("Unimplemented method 'getReservaById'");
    }

    @Override
    public List<Reserva> getReservaByUsuario(Long usuario_id) {
        throw new UnsupportedOperationException("Unimplemented method 'getReservaByUsuario'");
    }

    @Override
    public List<Reserva> getPaseByObra(Long obra_id) {
        throw new UnsupportedOperationException("Unimplemented method 'getPaseByObra'");
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        throw new UnsupportedOperationException("Unimplemented method 'saveReserva'");
    }

    @Override
    public void deleteReserva(Long idreserva) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteReserva'");
    }
    
}
