package com.ljez.pa5.domain.service;

import com.ljez.pa5.persistence.entity.Usuario;
import com.ljez.pa5.persistence.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public UsuarioService(UsuarioRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public void createUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    public Usuario findByEmailAndPassword(String email, String password) {
        return usuarioRepo.findByEmailAndPassword(email, password);
    }

}
