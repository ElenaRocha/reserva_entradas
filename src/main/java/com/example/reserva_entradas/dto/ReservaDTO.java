package com.example.reserva_entradas.dto;

import com.example.reserva_entradas.model.Reserva;
import com.example.reserva_entradas.model.Pase;
import com.example.reserva_entradas.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReservaDTO {
    private Long idreserva;

    //TODO: cómo anotar el timestamp, le falta el getter y setter
    private LocalDateTime time_stamp;

    private Usuario usuario;
    private Pase pase;
}
