package com.example.agrotraceback.JPA;

import com.example.agrotraceback.DTO.FincaDTO;
import com.example.agrotraceback.Enum.EstadoSalud;
import com.example.agrotraceback.Enum.Genero;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "animales")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "tipo_animal_id", nullable = false)
    private TipoAnimalJPA tipoAnimal;

    @ManyToOne
    @JoinColumn(name = "raza_id", nullable = false)
    private Raza raza;

    @ManyToOne
    @JoinColumn(name = "finca_id", nullable = false)
    private FincaJPA finca;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    private LocalDate fechaNacimiento;

    private BigDecimal pesoKg;

    @Enumerated(EnumType.STRING)
    private EstadoSalud estadoSalud;

    @Lob
    private String observaciones;

    private LocalDateTime fechaRegistro;

    private LocalDateTime ultimaActualizacion;

    private Boolean activo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoAnimalJPA getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimalJPA tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public FincaJPA getFinca() {
        return finca;
    }

    public void setFinca(FincaJPA finca) {
        this.finca = finca;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    public EstadoSalud getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(EstadoSalud estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public LocalDateTime getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(LocalDateTime ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
