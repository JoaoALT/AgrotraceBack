package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.AnimalAfectadoDTO;
import com.example.agrotraceback.JPA.AnimalAfectado;
import com.example.agrotraceback.ORM.AnimalAfectadoRepository;
import com.example.agrotraceback.ORM.AnimalRepository;
import com.example.agrotraceback.ORM.BroteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animales-afectados")
public class AnimalAfectadoController {

    @Autowired
    private AnimalAfectadoRepository animalAfectadoRepository;

    @Autowired
    private BroteRepository broteRepository;

    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping
    public AnimalAfectado crear(@RequestBody AnimalAfectadoDTO dto) {
        AnimalAfectado a = new AnimalAfectado();
        a.setBrote(broteRepository.findById(dto.getBroteId()).orElse(null));
        a.setAnimal(animalRepository.findById(dto.getAnimalId()).orElse(null));
        a.setFechaDeteccion(dto.getFechaDeteccion());
        a.setEstado(AnimalAfectado.Estado.valueOf(dto.getEstado().replace(" ", "_")));
        a.setObservaciones(dto.getObservaciones());

        return animalAfectadoRepository.save(a);
    }

    @GetMapping
    public List<AnimalAfectado> listar() {
        return animalAfectadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public AnimalAfectado obtener(@PathVariable Integer id) {
        return animalAfectadoRepository.findById(id).orElse(null);
    }
}
