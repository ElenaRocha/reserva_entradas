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
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reserva> getReservaById(Long idreserva) {
        return reservaRepository.findById(idreserva);
    }

    @Override
    public List<Reserva> getReservaByUsuario(Long usuario_id) {
        
    }

    @Override
    public List<Reserva> getPaseByObra(Long obra_id) {
        
    }

    @Override
    public Reserva saveReserva(Reserva reserva) {
        
    }

    @Override
    public void deleteReserva(Long idreserva) {
        
    }
    
}
