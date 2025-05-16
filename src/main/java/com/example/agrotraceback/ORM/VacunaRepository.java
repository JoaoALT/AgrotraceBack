package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
}

