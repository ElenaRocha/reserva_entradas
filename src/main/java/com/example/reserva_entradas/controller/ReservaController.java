package com.example.reserva_entradas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.dto.ReservaDTO;
import com.example.reserva_entradas.model.Reserva;
import com.example.reserva_entradas.service.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    
    @Autowired
    private ReservaService reservaService;

    @GetMapping
    public List<ReservaDTO> getAllReservas() {
        List<Reserva> reservas = reservaService.getAllReservas();
        return reservas.stream()
            .map(this::convertirReservaDto)
            .collect(Collectors.toList());
    };

    @GetMapping("/{idreserva}")
    public ReservaDTO getReservaById(@PathVariable Long idreserva) {
        return reservaService.getReservaById(idreserva)
            .map(this::convertirReservaDto)
            .orElse(null);
    };

    private ReservaDTO convertirReservaDto(Reserva reserva) {
        ReservaDTO reservaDTO = new ReservaDTO();
        reservaDTO.setIdreserva(reserva.getIdReserva());
        reservaDTO.setTime_stamp(reserva.getTime_stamp());
        reservaDTO.setUsuario(reserva.getUsuario());
        reservaDTO.setPase(reserva.getPase());
        return reservaDTO;
    }

    private Reserva convertirReservaEntidad(ReservaDTO reservaDTO) {
        Reserva reserva = new Reserva();
        reserva.setIdReserva(reservaDTO.getIdreserva());
        reserva.setTime_stamp(reservaDTO.getTime_stamp());
        reserva.setUsuario(reservaDTO.getUsuario());
        reserva.setPase(reserva.getPase());
        return reserva;
    }

}
