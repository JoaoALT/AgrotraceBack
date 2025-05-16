package com.example.agrotraceback.DTO;

import java.time.LocalDate;

public class BroteDTO {
    private String codigo;
    private String enfermedad;
    private Integer fincaId;
    private LocalDate fechaReporte;
    private Double latitud;
    private Double longitud;
    private Integer animalesAfectados;
    private String severidad;
    private String estado;
    private String sintomas;
    private String observaciones;
    private Integer usuarioId;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Integer getFincaId() {
        return fincaId;
    }

    public void setFincaId(Integer fincaId) {
        this.fincaId = fincaId;
    }

    public LocalDate getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(LocalDate fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Integer getAnimalesAfectados() {
        return animalesAfectados;
    }

    public void setAnimalesAfectados(Integer animalesAfectados) {
        this.animalesAfectados = animalesAfectados;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
}
