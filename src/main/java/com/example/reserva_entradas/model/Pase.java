package com.example.reserva_entradas.model;

import java.time.LocalDate;
import java.time.LocalTime;

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
    name = "pases"
)
public class Pase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpase;

    @Column(nullable = false)
    private LocalDate dia;
    
    @Column(nullable = false)
    private LocalTime hora;

    @Column(nullable = false)
    private Float precio;

    @ManyToOne
    @JoinColumn(
        name = "idobra",
        nullable = false
    )
    private Obra obra;

}
