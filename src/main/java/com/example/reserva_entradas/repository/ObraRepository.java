package com.example.reserva_entradas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reserva_entradas.model.Obra;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Long>{
    List<Obra> findByTeatroId(Long teatroId);
}
