package com.example.reserva_entradas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reserva_entradas.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    //TODO: tiene dos foreigne keys
}
