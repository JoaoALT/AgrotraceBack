package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
}

