package com.example.reserva_entradas.model;

import java.time.LocalDate;
import java.time.LocalTime;

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
    name = "pases"
)
public class Pase {
    private Long idpase;
    private LocalDate dia;
    private LocalTime hora;
    private Float precio;

}
