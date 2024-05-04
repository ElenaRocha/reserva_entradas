package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Reserva;
import com.example.reserva_entradas.repository.ReservaRepository;

@Service
public class ReservaService {
    private final ReservaRepository reservaRepository;

    @Autowired
    public ReservaService(ReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    public List<Reserva> getAllReservas(){
        return reservaRepository.findAll();
    }

    public Optional<Reserva> getReservaById(Long idreserva){
        return reservaRepository.findById(idreserva);
    }

    public List<Reserva> getReservaByUsuario(Long idusuario){
        return reservaRepository.findByUsuarioId(idusuario);
    }

    public List<Reserva> getReservaByPase(Long idpase){
        return reservaRepository.findByPaseId(idpase);
    }

    public Reserva saveReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    public void deleteReserva(Long idreserva){
        reservaRepository.deleteById(idreserva);
    }
}
