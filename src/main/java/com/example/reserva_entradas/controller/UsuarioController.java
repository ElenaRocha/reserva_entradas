package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.reserva_entradas.model.Usuario;
import com.example.reserva_entradas.service.UsuarioService;

@Controller
public class UsuarioController {
    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuarios")
    public String getAllUsuarios(Model model){
        try {
            List<Usuario> usuarios = usuarioService.getAllUsuarios();
            model.addAttribute("usuariosParaFront", usuarios);
            return "usuariosTemplate";
        } catch (Exception e) {
            return "Error al mostrar los usuarios" + e.getMessage();
        }
    }
}