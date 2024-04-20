package com.example.reserva_entradas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reserva_entradas.model.Pase;

@Repository
public interface PaseRepository extends JpaRepository<Pase, Long>{
    List<Pase> findByObraId(Long obraId);
}
