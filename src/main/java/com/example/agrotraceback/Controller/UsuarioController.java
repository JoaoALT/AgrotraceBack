package com.example.agrotraceback.Controller;

import com.example.agrotraceback.DTO.UsuarioDTO;
import com.example.agrotraceback.JPA.Usuario;
import com.example.agrotraceback.ORM.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario crear(@RequestBody UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setApellido(dto.getApellido());
        usuario.setEmail(dto.getEmail());
        usuario.setPasswordHash(dto.getPassword()); // Para producción, hashear
        usuario.setRol(Usuario.Rol.valueOf(dto.getRol()));
        usuario.setTelefono(dto.getTelefono());
        usuario.setFechaRegistro(LocalDateTime.now());
        usuario.setActivo(true);

        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario obtener(@PathVariable Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}
