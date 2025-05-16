package com.example.agrotraceback.DTO;

import java.time.LocalDate;

public class MovimientoDTO {
    private String codigo;
    private Integer animalId;
    private Integer fincaOrigenId;
    private Integer fincaDestinoId;
    private LocalDate fechaMovimiento;
    private String motivo;
    private String guiaMovilizacion;
    private Integer usuarioId;
    private String observaciones;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public Integer getFincaOrigenId() {
        return fincaOrigenId;
    }

    public void setFincaOrigenId(Integer fincaOrigenId) {
        this.fincaOrigenId = fincaOrigenId;
    }

    public Integer getFincaDestinoId() {
        return fincaDestinoId;
    }

    public void setFincaDestinoId(Integer fincaDestinoId) {
        this.fincaDestinoId = fincaDestinoId;
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getGuiaMovilizacion() {
        return guiaMovilizacion;
    }

    public void setGuiaMovilizacion(String guiaMovilizacion) {
        this.guiaMovilizacion = guiaMovilizacion;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}

