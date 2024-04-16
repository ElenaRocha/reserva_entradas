package com.example.reserva_entradas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProbandoConexion {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProbandoConexion(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    };

    @GetMapping("/pruebaConexion")
    public String pruebaConexionBaseDatos(){
        try {
            jdbcTemplate.execute("SELECT 1 FROM DUAL");
            return "La conexión fue correcta";
        } catch (Exception e) {
            return "Error en la conexión" + e.getMessage();
        }
    }

}
