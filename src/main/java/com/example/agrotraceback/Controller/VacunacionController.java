package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.VacunacionDTO;
import com.example.agrotraceback.JPA.Vacunacion;
import com.example.agrotraceback.ORM.AnimalRepository;
import com.example.agrotraceback.ORM.UsuarioRepository;
import com.example.agrotraceback.ORM.VacunaRepository;
import com.example.agrotraceback.ORM.VacunacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/vacunaciones")
public class VacunacionController {

    @Autowired
    private VacunacionRepository vacunacionRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private VacunaRepository vacunaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Vacunacion crear(@RequestBody VacunacionDTO dto) {
        Vacunacion v = new Vacunacion();
        v.setCodigo(dto.getCodigo());
        v.setAnimal(animalRepository.findById(dto.getAnimalId()).orElse(null));
        v.setVacuna(vacunaRepository.findById(dto.getVacunaId()).orElse(null));
        v.setFechaAplicacion(dto.getFechaAplicacion());
        v.setLote(dto.getLote());
        v.setFechaVencimiento(dto.getFechaVencimiento());
        v.setDosis(dto.getDosis());
        v.setUsuario(usuarioRepository.findById(dto.getUsuarioId()).orElse(null));
        v.setObservaciones(dto.getObservaciones());
        v.setFechaRegistro(LocalDateTime.now());

        return vacunacionRepository.save(v);
    }

    @GetMapping
    public List<Vacunacion> listar() {
        return vacunacionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vacunacion obtener(@PathVariable Integer id) {
        return vacunacionRepository.findById(id).orElse(null);
    }
}
