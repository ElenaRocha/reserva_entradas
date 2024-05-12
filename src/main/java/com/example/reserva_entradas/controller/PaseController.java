package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reserva_entradas.model.Pase;
import com.example.reserva_entradas.service.PaseService;

@Controller
public class PaseController {
    private final PaseService paseService;
    
    @Autowired
    public PaseController(PaseService paseService){
        this.paseService = paseService;
    }

    @GetMapping("/pases")
    public String getAllPases(Model model){
        try {
            List<Pase> pases = paseService.getAllPases();
            model.addAttribute("pasesParaFront", pases);
            return "pasesTemplate";
        } catch (Exception e) {
            return "Error al mostrar los pases" + e.getMessage();
        }
    }

    //TODO: get pase by id

    //TODO: get pase by obra

    @PostMapping("/guardarpase")
    public String savePase(@ModelAttribute Pase pase){
        paseService.savePase(pase);
        return "redirect:/pases";
    }
}
