package com.example.reserva_entradas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reserva_entradas.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{
    List<Reserva> findByUsuarioId(Long usuarioId);
    List<Reserva> findByPaseId(Long paseId);
}
