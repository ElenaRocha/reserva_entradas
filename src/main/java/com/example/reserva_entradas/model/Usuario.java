package com.example.reserva_entradas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(
    name = "usuarios"
)
public class Usuario {
    private Long idusuario;
    private String email;
    private String contrasena;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Integer telefono;
    private String rol;
}
