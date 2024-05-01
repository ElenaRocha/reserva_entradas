package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

    private ReservaDTO convertirReservaDto(Reserva reserva) {
        ReservaDTO reservaDTO = new ReservaDTO();
        reservaDTO.setIdreserva(reserva.getIdReserva());
        reservaDTO.setTime_stamp(reserva.getTime_stamp());
        reservaDTO.setUsuario(reserva.getUsuario());
        reservaDTO.setPase(reserva.getPase());
    }

}
