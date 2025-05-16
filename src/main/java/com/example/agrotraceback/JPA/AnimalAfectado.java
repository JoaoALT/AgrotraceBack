package com.example.agrotraceback.JPA;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "animales_afectados")
public class AnimalAfectado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "brote_id")
    private Brote brote;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @Column(name = "fecha_deteccion")
    private LocalDate fechaDeteccion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private String observaciones;

    public enum Estado {
        Afectado,
        En_tratamiento,
        Recuperado,
        Fallecido
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Brote getBrote() {
        return brote;
    }

    public void setBrote(Brote brote) {
        this.brote = brote;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public LocalDate getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(LocalDate fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

