package com.example.agrotraceback.DTO;

public class VacunaDTO {
    private String nombre;
    private Integer tipoAnimalId;
    private String enfermedad;
    private String fabricante;
    private String descripcion;
    private String dosisEstandar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipoAnimalId() {
        return tipoAnimalId;
    }

    public void setTipoAnimalId(Integer tipoAnimalId) {
        this.tipoAnimalId = tipoAnimalId;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDosisEstandar() {
        return dosisEstandar;
    }

    public void setDosisEstandar(String dosisEstandar) {
        this.dosisEstandar = dosisEstandar;
    }
}
