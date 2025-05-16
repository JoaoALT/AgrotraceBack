package com.example.agrotraceback.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class AnimalDTO {
    private String codigo;
    private Integer tipoAnimalId;
    private Integer razaId;
    private Integer fincaId;
    private String genero;
    private LocalDate fechaNacimiento;
    private BigDecimal pesoKg;
    private String estadoSalud;
    private String observaciones;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getTipoAnimalId() {
        return tipoAnimalId;
    }

    public void setTipoAnimalId(Integer tipoAnimalId) {
        this.tipoAnimalId = tipoAnimalId;
    }

    public Integer getRazaId() {
        return razaId;
    }

    public void setRazaId(Integer razaId) {
        this.razaId = razaId;
    }

    public Integer getFincaId() {
        return fincaId;
    }

    public void setFincaId(Integer fincaId) {
        this.fincaId = fincaId;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public BigDecimal getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(BigDecimal pesoKg) {
        this.pesoKg = pesoKg;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

