package com.example.reserva_entradas.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping
    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios =usuarioService.getAllUsuarios();
        return usuarios.stream()
            .map(this::convertirUsuarioDTO)
            .collect(Collectors.toList());
    };

    @GetMapping("/{idusuario}")
    public UsuarioDTO getUsuarioById(@PathVariable Long idusuario) {
        return usuarioService.getUsuarioById(idusuario)
        .map(this::convertirUsuarioDTO)
        .orElse(null);
    };

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
        return usuarioDTO;
    }

    private Usuario convertirUsuarioEntidad(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(usuarioDTO.getIdusuario());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setContrasena(usuarioDTO.getContrasena());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setApellido1(usuarioDTO.getApellido1());
        usuario.setApellido2(usuarioDTO.getApellido2());
        usuario.setTelefono(usuarioDTO.getTelefono());
        usuario.setRol(usuarioDTO.getRol());
        usuario.setTeatro(usuarioDTO.getTeatro());
        return usuario;
    }

}
