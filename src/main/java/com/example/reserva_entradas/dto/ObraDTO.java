package com.example.reserva_entradas.dto;

import com.example.reserva_entradas.model.Obra;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ObraDTO {
    private Long idobra;
    private String titulo;
    private String autor;
    private String sinopsis;
    private Integer duracion_min;
    private Teatro teatro;
}
