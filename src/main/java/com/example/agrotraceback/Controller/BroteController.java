package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.BroteDTO;
import com.example.agrotraceback.JPA.Brote;
import com.example.agrotraceback.ORM.BroteRepository;
import com.example.agrotraceback.ORM.FincaRepository;
import com.example.agrotraceback.ORM.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/brotes")
public class BroteController {

    @Autowired
    private BroteRepository broteRepository;

    @Autowired
    private FincaRepository fincaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Brote crear(@RequestBody BroteDTO dto) {
        Brote b = new Brote();
        b.setCodigo(dto.getCodigo());
        b.setEnfermedad(dto.getEnfermedad());
        b.setFinca(fincaRepository.findById(dto.getFincaId()).orElse(null));
        b.setFechaReporte(dto.getFechaReporte());
        b.setLatitud(dto.getLatitud());
        b.setLongitud(dto.getLongitud());
        b.setAnimalesAfectados(dto.getAnimalesAfectados());
        b.setSeveridad(Brote.Severidad.valueOf(dto.getSeveridad()));
        b.setEstado(Brote.Estado.valueOf(dto.getEstado()));
        b.setSintomas(dto.getSintomas());
        b.setObservaciones(dto.getObservaciones());
        b.setUsuario(usuarioRepository.findById(dto.getUsuarioId()).orElse(null));
        b.setFechaRegistro(LocalDateTime.now());

        return broteRepository.save(b);
    }

    @GetMapping
    public List<Brote> listar() {
        return broteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Brote obtener(@PathVariable Integer id) {
        return broteRepository.findById(id).orElse(null);
    }
}
