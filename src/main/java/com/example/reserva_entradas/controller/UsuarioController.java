package com.example.reserva_entradas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    //TODO: get usuario by id

    //TODO: get usuario by teatro

    @PostMapping("/guardarusuario")
    public String saveUsuario(@ModelAttribute Usuario usuario){
        usuarioService.saveUsuario(usuario);
        return "redirect:/usuarios";
    }

    @PostMapping("/actualizarusuario")
    public String updateUsuario(@ModelAttribute Usuario usuario){
        usuarioService.updateUsuario(usuario.getIdUsuario(), usuario);
        return "redirect:/usuarios";
    }

    @PostMapping("/eliminarusuario")
    public String eliminarUsuario(@ModelAttribute Long idusuario){
        usuarioService.deleteUsuario(idusuario);
        return "redirect:/usuarios";
    }
}