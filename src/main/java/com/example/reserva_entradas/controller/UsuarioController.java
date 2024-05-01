package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.reserva_entradas.dto.UsuarioDTO;
import com.example.reserva_entradas.model.Usuario;
import com.example.reserva_entradas.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    private UsuarioDTO convertirUsuarioDTO(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setIdusuario(usuario.getIdUsuario());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setContrasena(usuario.getContrasena());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setApellido1(usuario.getApellido1());
        usuarioDTO.setApellido2(usuario.getApellido2());
        usuarioDTO.setTelefono(usuario.getTelefono());
        usuarioDTO.setRol(usuario.getRol());
        usuarioDTO.setTeatro(usuario.getTeatro());
    }

}
