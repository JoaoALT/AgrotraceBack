package com.example.agrotraceback.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FincaRepository extends JpaRepository<FincaJPA, Integer> {
    boolean existsByCodigo(String codigo);
}
