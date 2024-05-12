package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.reserva_entradas.model.Teatro;
import com.example.reserva_entradas.service.TeatroService;

@Controller
public class TeatroController {
    private final TeatroService teatroService;

    @Autowired
    public TeatroController(TeatroService teatroService){
        this.teatroService = teatroService;
    }

    @GetMapping("/teatros")
    public String getAllTeatros(Model model){
        try {
            List<Teatro> teatros = teatroService.getAllTeatros();
            model.addAttribute("teatrosParaFront", teatros);
            return "teatrosTemplate";
        } catch (Exception e) {
            return "Error al mostrar los teatros" + e.getMessage();
        }
    }

    //TODO: get teatro by id

    @PostMapping("/guardarteatro")
    public String saveTeatro(@ModelAttribute Teatro teatro){
        teatroService.saveTeatro(teatro);
        return "redirect:/teatros";
    }
}