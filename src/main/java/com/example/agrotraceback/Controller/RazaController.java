package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.RazaDTO;
import com.example.agrotraceback.JPA.Raza;
import com.example.agrotraceback.JPA.TipoAnimalJPA;
import com.example.agrotraceback.ORM.RazaRepository;
import com.example.agrotraceback.ORM.TipoAnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/razas")
public class RazaController {

    @Autowired
    private RazaRepository razaRepository;

    @Autowired
    private TipoAnimalRepository tipoAnimalRepository;

    @PostMapping
    public Raza crearRaza(@RequestBody RazaDTO dto) {
        TipoAnimalJPA tipo = tipoAnimalRepository.findById(dto.getTipoAnimalId()).orElse(null);
        if (tipo == null) return null;

        Raza raza = new Raza();
        raza.setNombre(dto.getNombre());
        raza.setDescripcion(dto.getDescripcion());
        raza.setTipoAnimal(tipo);

        return razaRepository.save(raza);
    }

    @GetMapping
    public List<Raza> listarRazas() {
        return razaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Raza obtenerRaza(@PathVariable Integer id) {
        return razaRepository.findById(id).orElse(null);
    }
}

