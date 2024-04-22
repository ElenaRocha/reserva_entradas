package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Override
    public List<Usuario> getAllUsuarios() {
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsuarios'");
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long idusuario) {
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarioById'");
    }

    @Override
    public List<Usuario> getUsuarioByTeatro(Long teatro_id) {
        throw new UnsupportedOperationException("Unimplemented method 'getUsuarioByTeatro'");
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Unimplemented method 'saveUsuario'");
    }

    @Override
    public void deleteTeatro(Long idteatro) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteTeatro'");
    }
    
}
