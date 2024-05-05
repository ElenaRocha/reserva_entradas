package com.example.reserva_entradas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.reserva_entradas.model.Teatro;

@Repository
public interface TeatroRepository extends JpaRepository<Teatro, Long>{
    
}
