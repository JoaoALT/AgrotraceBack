package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.MovimientoDTO;
import com.example.agrotraceback.JPA.Movimiento;
import com.example.agrotraceback.ORM.AnimalRepository;
import com.example.agrotraceback.ORM.FincaRepository;
import com.example.agrotraceback.ORM.MovimientoRepository;
import com.example.agrotraceback.ORM.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoRepository movimientoRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private FincaRepository fincaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Movimiento crear(@RequestBody MovimientoDTO dto) {
        Movimiento m = new Movimiento();
        m.setCodigo(dto.getCodigo());
        m.setAnimal(animalRepository.findById(dto.getAnimalId()).orElse(null));
        m.setFincaOrigen(fincaRepository.findById(dto.getFincaOrigenId()).orElse(null));
        m.setFincaDestino(fincaRepository.findById(dto.getFincaDestinoId()).orElse(null));
        m.setFechaMovimiento(dto.getFechaMovimiento());
        m.setMotivo(dto.getMotivo());
        m.setGuiaMovilizacion(dto.getGuiaMovilizacion());
        m.setUsuario(usuarioRepository.findById(dto.getUsuarioId()).orElse(null));
        m.setObservaciones(dto.getObservaciones());

        return movimientoRepository.save(m);
    }

    @GetMapping
    public List<Movimiento> listar() {
        return movimientoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Movimiento obtener(@PathVariable Integer id) {
        return movimientoRepository.findById(id).orElse(null);
    }
}
