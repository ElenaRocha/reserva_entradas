package com.example.reserva_entradas.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Usuario;
import com.example.reserva_entradas.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios(){
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long idusuario){
        return usuarioRepository.findById(idusuario);
    }

    public List<Usuario> getUsuarioByTeatro(Long idteatro){
        return usuarioRepository.findByTeatroId(idteatro);
    }

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario updateUsuario(Long idusuario, Usuario usuario){
        Usuario usuarioExistente = usuarioRepository.findById(idusuario)
            .orElseThrow(() -> new NoSuchElementException("Usuario no encontrado"));
        
        usuarioExistente.setEmail(usuario.getEmail());
        usuarioExistente.setContrasena(usuario.getContrasena());
        usuarioExistente.setNombre(usuario.getNombre());
        usuarioExistente.setApellido1(usuario.getApellido1());
        usuarioExistente.setTelefono(usuario.getTelefono());
        usuarioExistente.setRol(usuario.getRol());
        usuarioExistente.setTeatro(usuario.getTeatro());

        return usuarioRepository.save(usuarioExistente);
        
    }

    public void deleteUsuario(Long idusuario){
        usuarioRepository.deleteById(idusuario);
    }
}
