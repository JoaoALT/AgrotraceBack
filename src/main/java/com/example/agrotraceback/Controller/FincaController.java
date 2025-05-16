package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.FincaDTO;
import com.example.agrotraceback.JPA.FincaJPA;
import com.example.agrotraceback.JPA.FincaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fincas")
public class FincaController {

    @Autowired
    private FincaRepository fincaRepository;

    @PostMapping
    public FincaJPA crearFinca(@RequestBody FincaDTO dto) {
        FincaJPA finca = new FincaJPA();
        finca.setNombre(dto.getNombre());
        finca.setCodigo(dto.getCodigo());
        finca.setDireccion(dto.getDireccion());
        finca.setMunicipio(dto.getMunicipio());
        finca.setDepartamento(dto.getDepartamento());
        finca.setLatitud(dto.getLatitud());
        finca.setLongitud(dto.getLongitud());
        finca.setAreaHectareas(dto.getAreaHectareas());
        finca.setPropietario(dto.getPropietario());
        finca.setTelefono(dto.getTelefono());
        finca.setEmail(dto.getEmail());

        return fincaRepository.save(finca);
    }

    @GetMapping
    public List<FincaJPA> listarFincas() {
        return fincaRepository.findAll();
    }

    @GetMapping("/{id}")
    public FincaJPA obtenerFinca(@PathVariable Integer id) {
        return fincaRepository.findById(id).orElse(null);
    }
}
