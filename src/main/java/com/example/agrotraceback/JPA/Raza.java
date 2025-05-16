package com.example.agrotraceback.JPA;

import com.example.agrotraceback.JPA.TipoAnimalJPA;
import jakarta.persistence.*;

@Entity
@Table(name = "razas")
public class Raza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "tipo_animal_id", nullable = false)
    private TipoAnimalJPA tipoAnimal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoAnimalJPA getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalJPA tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
}

