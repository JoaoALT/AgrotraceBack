package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.Brote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BroteRepository extends JpaRepository<Brote, Integer> {
    boolean existsByCodigo(String codigo);
}
