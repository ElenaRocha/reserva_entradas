package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Usuario;
import com.example.reserva_entradas.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long idusuario) {
        return usuarioRepository.findById(idusuario);
    }

    @Override
    public List<Usuario> getUsuarioByTeatro(Long teatro_id) {
        return usuarioRepository.findByTeatroId(teatro_id);
    }

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public void deleteTeatro(Long idusuario) {
        usuarioRepository.deleteById(idusuario);
    }
    
}
