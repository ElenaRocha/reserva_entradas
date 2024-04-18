package com.example.reserva_entradas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(
    name = "teatros"
)
public class Teatro {

    public Long getIdTeatro() {
        return idteatro;
    }

    public void setIdTeatro(Long idteatro) {
        this.idteatro = idteatro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idteatro;

    @Column(nullable = false)
    private String nombre;

    @Column
    private String presentacion;
}
