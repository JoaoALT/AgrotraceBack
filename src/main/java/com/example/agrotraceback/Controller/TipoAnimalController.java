package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.TipoAnimalDTO;
import com.example.agrotraceback.JPA.TipoAnimalJPA;
import com.example.agrotraceback.ORM.TipoAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipos-animal")
public class TipoAnimalController {

    @Autowired
    private TipoAnimalRepository tipoAnimalRepository;

    @PostMapping
    public TipoAnimalJPA crearTipoAnimal(@RequestBody TipoAnimalDTO dto) {
        TipoAnimalJPA tipo = new TipoAnimalJPA();
        tipo.setNombre(dto.getNombre());
        tipo.setDescripcion(dto.getDescripcion());
        return tipoAnimalRepository.save(tipo);
    }

    @GetMapping
    public List<TipoAnimalJPA> listarTiposAnimal() {
        return tipoAnimalRepository.findAll();
    }

    @GetMapping("/{id}")
    public TipoAnimalJPA obtenerTipoAnimal(@PathVariable Integer id) {
        return tipoAnimalRepository.findById(id).orElse(null);
    }
}
