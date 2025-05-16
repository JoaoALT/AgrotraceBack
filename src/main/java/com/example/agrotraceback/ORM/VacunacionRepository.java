package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.Vacunacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunacionRepository extends JpaRepository<Vacunacion, Integer> {
    boolean existsByCodigo(String codigo);
}
