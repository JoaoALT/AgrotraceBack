package com.example.agrotraceback.DTO;

import java.time.LocalDate;

public class AnimalAfectadoDTO {
    private Integer broteId;
    private Integer animalId;
    private LocalDate fechaDeteccion;
    private String estado;
    private String observaciones;

    public Integer getBroteId() {
        return broteId;
    }

    public void setBroteId(Integer broteId) {
        this.broteId = broteId;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public LocalDate getFechaDeteccion() {
        return fechaDeteccion;
    }

    public void setFechaDeteccion(LocalDate fechaDeteccion) {
        this.fechaDeteccion = fechaDeteccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
