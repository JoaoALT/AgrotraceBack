package com.example.agrotraceback.JPA;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimientos")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String codigo;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "finca_origen_id")
    private FincaJPA fincaOrigen;

    @ManyToOne
    @JoinColumn(name = "finca_destino_id")
    private FincaJPA fincaDestino;

    @Column(name = "fecha_movimiento")
    private LocalDate fechaMovimiento;

    private String motivo;

    @Column(name = "guia_movilizacion")
    private String guiaMovilizacion;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String observaciones;

    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate() {
        this.fechaRegistro = LocalDateTime.now();
    }

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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public FincaJPA getFincaOrigen() {
        return fincaOrigen;
    }

    public void setFincaOrigen(FincaJPA fincaOrigen) {
        this.fincaOrigen = fincaOrigen;
    }

    public FincaJPA getFincaDestino() {
        return fincaDestino;
    }

    public void setFincaDestino(FincaJPA fincaDestino) {
        this.fincaDestino = fincaDestino;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
}
