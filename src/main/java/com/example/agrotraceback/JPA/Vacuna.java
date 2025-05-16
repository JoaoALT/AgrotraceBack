package com.example.agrotraceback.JPA;

import jakarta.persistence.*;

@Entity
@Table(name = "vacunas")
public class Vacuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "tipo_animal_id", nullable = false)
    private TipoAnimalJPA tipoAnimal;

    private String enfermedad;

    private String fabricante;

    private String descripcion;

    private String dosisEstandar;

    private Boolean activo;

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

    public TipoAnimalJPA getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalJPA tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
