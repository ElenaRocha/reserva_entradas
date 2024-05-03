package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import com.example.reserva_entradas.model.Usuario;

public interface UsuarioService {
    List<Usuario> getAllUsuarios();

    Optional<Usuario> getUsuarioById(Long idusuario);

    List<Usuario> getUsuarioByTeatro(Long teatro_id);

    Usuario saveUsuario(Usuario usuario);

    void deleteUsuario(Long idusuario);
}
