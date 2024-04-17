package com.example.reserva_entradas.model;

import java.time.LocalDateTime;

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
    name = "reservas"
)
public class Reserva {
    private Long idreserva;
    private LocalDateTime timestamp;
}
