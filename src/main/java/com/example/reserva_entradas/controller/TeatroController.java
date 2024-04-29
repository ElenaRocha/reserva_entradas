package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.service.TeatroService;

@RestController
@RequestMapping("/teatro")
public class TeatroController {
    
    @Autowired
    private TeatroService teatroService;

}
