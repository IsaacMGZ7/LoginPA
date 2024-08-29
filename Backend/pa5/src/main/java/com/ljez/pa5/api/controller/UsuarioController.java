package com.ljez.pa5.api.controller;

import com.ljez.pa5.domain.dto.UsuarioDTO;
import com.ljez.pa5.domain.mapper.UsuarioMapper;
import com.ljez.pa5.domain.service.UsuarioService;
import com.ljez.pa5.persistence.entity.Usuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public void createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.toUsuario(usuarioDTO);
        usuarioService.createUsuario(usuario);
    }

    @PostMapping("/login")
    public Usuario findByEmailAndPassword(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.findByEmailAndPassword(usuarioDTO.getEmail(), usuarioDTO.getPassword());
    }
}
