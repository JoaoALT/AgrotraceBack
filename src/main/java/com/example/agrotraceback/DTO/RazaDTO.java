package com.example.agrotraceback.DTO;

public class RazaDTO {
    private String nombre;
    private String descripcion;
    private Integer tipoAnimalId;

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

    public Integer getTipoAnimalId() {
        return tipoAnimalId;
    }

    public void setTipoAnimalId(Integer tipoAnimalId) {
        this.tipoAnimalId = tipoAnimalId;
    }
}
