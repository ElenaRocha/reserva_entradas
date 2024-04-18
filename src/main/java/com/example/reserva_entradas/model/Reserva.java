package com.example.reserva_entradas.model;

import java.time.LocalDateTime;

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
    name = "reservas"
)
public class Reserva {

    public Long getIdReserva() {
        return idreserva;
    }

    public void setIdReserva(Long idreserva) {
        this.idreserva = idreserva;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreserva;

    //TODO: cómo anotar el timestamp, le falta el getter y setter
    @Column(nullable = false)
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(
        name = "idusuario",
        nullable = false
    )
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(
        name = "idpase",
        nullable = false
    )
    private Pase pase;
}
