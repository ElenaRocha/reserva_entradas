package com.example.reserva_entradas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    public Long getIdUsuario() {
        return idusuario;
    }

    public void setIdUsuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String contrasena;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido1;

    @Column
    private String apellido2;

    @Column
    private String telefono;

    @Column(nullable = false)
    private String rol;
    
    @ManyToOne
    @JoinColumn(
        name = "idteatro",
        nullable = false
    )
    private Teatro teatro;
}
