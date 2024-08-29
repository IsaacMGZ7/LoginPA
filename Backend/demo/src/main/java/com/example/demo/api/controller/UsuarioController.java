package com.example.demo.api.controller;

import com.example.demo.domain.common.UsuarioRoute;
import com.example.demo.domain.dto.UsuarioDTO;
import com.example.demo.domain.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/" + UsuarioRoute.API + UsuarioRoute.Usuario.USER)
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(value = "/" + UsuarioRoute.Usuario.SAVE_USUARIO)
    public UsuarioDTO save(@RequestBody UsuarioDTO usuarioDTO){
        return usuarioService.save(usuarioDTO);
    }

    @PostMapping(value = "/" + UsuarioRoute.Usuario.LOGIN)
    public ResponseEntity<?> findUserAndPassword(@RequestBody UsuarioDTO usuarioDTO) {
    Optional<UsuarioDTO> usuarioDTOOptional = UsuarioService.findByIdAndPassword(usuarioDTO.getUsuario(), usuarioDTO.getClave());
    if (usuarioDTOOptional.isPresent()) {
        return ResponseEntity.ok(usuarioDTOOptional.get());
    }
    return ResponseEntity.notFound().build();
}

    @GetMapping(value = "/" + UsuarioRoute.Usuario.GET_USUARIO)
    public List<UsuarioDTO> get(){
        return usuarioService.getAll();
    }
}

