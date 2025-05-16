package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.FincaJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FincaRepository extends JpaRepository<FincaJPA, Integer> {
    boolean existsByCodigo(String codigo);
}
