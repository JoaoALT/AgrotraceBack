package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.SincronizacionDTO;
import com.example.agrotraceback.JPA.Sincronizacion;
import com.example.agrotraceback.ORM.SincronizacionRepository;
import com.example.agrotraceback.ORM.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sincronizaciones")
public class SincronizacionController {

    @Autowired
    private SincronizacionRepository sincronizacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Sincronizacion crear(@RequestBody SincronizacionDTO dto) {
        Sincronizacion s = new Sincronizacion();
        s.setDispositivoId(dto.getDispositivoId());
        s.setUsuario(usuarioRepository.findById(dto.getUsuarioId()).orElse(null));
        s.setTipoRegistro(Sincronizacion.TipoRegistro.valueOf(dto.getTipoRegistro()));
        s.setRegistroId(dto.getRegistroId());
        s.setAccion(Sincronizacion.Accion.valueOf(dto.getAccion()));
        s.setEstado(dto.getEstado() != null ?
                Sincronizacion.Estado.valueOf(dto.getEstado()) :
                Sincronizacion.Estado.Pendiente);
        s.setDatosJson(dto.getDatosJson());
        s.setMensajeError(dto.getMensajeError());

        return sincronizacionRepository.save(s);
    }

    @GetMapping
    public List<Sincronizacion> listar() {
        return sincronizacionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sincronizacion obtener(@PathVariable Integer id) {
        return sincronizacionRepository.findById(id).orElse(null);
    }
}

