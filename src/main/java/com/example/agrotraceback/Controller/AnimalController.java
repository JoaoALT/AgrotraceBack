package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.AnimalDTO;
import com.example.agrotraceback.Enum.EstadoSalud;
import com.example.agrotraceback.Enum.Genero;
import com.example.agrotraceback.JPA.Animal;
import com.example.agrotraceback.ORM.AnimalRepository;
import com.example.agrotraceback.ORM.FincaRepository;
import com.example.agrotraceback.ORM.RazaRepository;
import com.example.agrotraceback.ORM.TipoAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animales")
public class AnimalController {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    private TipoAnimalRepository tipoAnimalRepository;

    @Autowired
    private RazaRepository razaRepository;

    @Autowired
    private FincaRepository fincaRepository;

    @PostMapping
    public Animal crearAnimal(@RequestBody AnimalDTO dto) {
        Animal animal = new Animal();
        animal.setCodigo(dto.getCodigo());
        animal.setGenero(Genero.valueOf(dto.getGenero()));
        animal.setEstadoSalud(EstadoSalud.valueOf(dto.getEstadoSalud().replace(" ", "_")));

        animal.setFechaNacimiento(dto.getFechaNacimiento());
        animal.setPesoKg(dto.getPesoKg());
        animal.setObservaciones(dto.getObservaciones());

        animal.setTipoAnimal(tipoAnimalRepository.findById(dto.getTipoAnimalId()).orElse(null));
        animal.setRaza(razaRepository.findById(dto.getRazaId()).orElse(null));
        animal.setFinca(fincaRepository.findById(dto.getFincaId()).orElse(null));

        animal.setFechaRegistro(java.time.LocalDateTime.now());
        animal.setActivo(true);

        return animalRepository.save(animal);
    }

    @GetMapping
    public List<Animal> listar() {
        return animalRepository.findAll();
    }

    @GetMapping("/{id}")
    public Animal obtener(@PathVariable Integer id) {
        return animalRepository.findById(id).orElse(null);
    }
}

