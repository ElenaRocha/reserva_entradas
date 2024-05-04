package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.model.Reserva;
import com.example.reserva_entradas.service.ReservaService;

@Controller
public class ReservaController {
    private final ReservaService reservaService;

    @Autowired
    public ReservaController(ReservaService reservaService){
        this.reservaService = reservaService;
    }

    @GetMapping("/reservas")
    public String getAllReservas(Model model){
        try {
            List<Reserva> reservas = reservaService.getAllReservas();
            model.addAttribute("reservasParaFront", reservas);
            return "reservasTemplate";
        } catch (Exception e) {
            return "Error al mostrar las reservas" + e.getMessage();
        }
    }

    //TODO: get reserva by id

    //TODO: get reserva by usuario

    //TODO: get reserva by pase

    @PostMapping("/reservas")
    public String saveReserva(@ModelAttribute Reserva reserva){
        reservaService.saveReserva(reserva);
        return "redirect:/reservas";
    }
}