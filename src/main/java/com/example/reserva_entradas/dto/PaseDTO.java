package com.example.reserva_entradas.dto;

//import com.example.reserva_entradas.model.Pase;

import java.time.LocalDate;
import java.time.LocalTime;

import com.example.reserva_entradas.model.Obra;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PaseDTO {
    private Long idpase;
    private LocalDate dia;
    private LocalTime hora;
    private Float precio;
    private Obra obra;
}
