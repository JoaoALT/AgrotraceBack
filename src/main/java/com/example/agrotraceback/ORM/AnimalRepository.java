package com.example.agrotraceback.ORM;

import com.example.agrotraceback.JPA.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}

