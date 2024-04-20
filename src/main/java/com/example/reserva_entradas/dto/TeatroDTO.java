package com.example.reserva_entradas.dto;

import com.example.reserva_entradas.model.Teatro;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeatroDTO {
    private Long idteatro;
    private String nombre;
    private String presentacion;
}
