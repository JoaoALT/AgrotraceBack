package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.VacunaDTO;
import com.example.agrotraceback.JPA.Vacuna;
import com.example.agrotraceback.ORM.TipoAnimalRepository;
import com.example.agrotraceback.ORM.VacunaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vacunas")
public class VacunaController {

    @Autowired
    private VacunaRepository vacunaRepository;

    @Autowired
    private TipoAnimalRepository tipoAnimalRepository;

    @PostMapping
    public Vacuna crear(@RequestBody VacunaDTO dto) {
        Vacuna vacuna = new Vacuna();
        vacuna.setNombre(dto.getNombre());
        vacuna.setEnfermedad(dto.getEnfermedad());
        vacuna.setFabricante(dto.getFabricante());
        vacuna.setDescripcion(dto.getDescripcion());
        vacuna.setDosisEstandar(dto.getDosisEstandar());
        vacuna.setActivo(true);

        vacuna.setTipoAnimal(tipoAnimalRepository.findById(dto.getTipoAnimalId()).orElse(null));

        return vacunaRepository.save(vacuna);
    }

    @GetMapping
    public List<Vacuna> listar() {
        return vacunaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Vacuna obtener(@PathVariable Integer id) {
        return vacunaRepository.findById(id).orElse(null);
    }
}
