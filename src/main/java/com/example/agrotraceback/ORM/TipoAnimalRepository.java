package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.TipoAnimalJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAnimalRepository extends JpaRepository<TipoAnimalJPA, Integer> {
    boolean existsByNombre(String nombre);
}

