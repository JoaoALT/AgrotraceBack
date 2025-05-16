package com.example.agrotraceback.JPA;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoAnimalRepository extends JpaRepository<TipoAnimalJPA, Integer> {
    boolean existsByNombre(String nombre);
}

