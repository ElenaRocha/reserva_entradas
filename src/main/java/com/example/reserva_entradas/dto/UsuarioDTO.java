package com.example.reserva_entradas.dto;

import com.example.reserva_entradas.model.Usuario;
import com.example.reserva_entradas.model.Teatro;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UsuarioDTO {
    private Long idusuario;
    private String email;
    private String contrasena;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String rol;
    private Teatro teatro;
}
