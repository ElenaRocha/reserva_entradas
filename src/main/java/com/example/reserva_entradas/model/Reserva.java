package com.example.reserva_entradas.model;

import java.sql.Timestamp;
//import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

//import jakarta.persistence.Column;
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

    public Timestamp getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(Timestamp time_stamp) {
        this.time_stamp = time_stamp;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idreserva;

    @CreationTimestamp
    private Timestamp time_stamp;

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
