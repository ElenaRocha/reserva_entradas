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
    name = "obras"
)
public class Obra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idobra;

    @Column(nullable = false)
    private String titulo;

    @Column
    private String autor;

    @Column
    private String sinopsis;

    @Column
    private Integer duracion_min;

    @ManyToOne
    @JoinColumn(
        name = "idteatro",
        nullable = false
    )
    private Teatro teatro;
}
