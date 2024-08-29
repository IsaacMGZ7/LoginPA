package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.UsuarioDTO;
import com.example.demo.persistence.entity.Usuario;

import java.util.Random;

public class UsuarioMapper {

    public static Usuario toEntinty(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsuario(usuarioDTO.getUsuario());
        usuario.setClave(usuarioDTO.getClave());
        usuario.setCorreo(usuarioDTO.getCorreo());
        usuario.setEstado(usuarioDTO.getEstado());
        usuario.setFechaRegistro(usuarioDTO.getFechaRegistro());
        usuario.setNombre_Completo(usuarioDTO.getNombre_Completo());
        usuario.setIdUsuario(new Random().nextLong());
        return usuario;
    }

    public static UsuarioDTO toDto(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setUsuario(usuario.getUsuario());
        usuarioDTO.setClave(usuario.getClave());
        usuarioDTO.setCorreo(usuario.getCorreo());
        usuarioDTO.setEstado(usuario.getEstado());
        usuarioDTO.setFechaRegistro(usuario.getFechaRegistro());
        usuarioDTO.setNombre_Completo(usuario.getNombre_Completo());
        return usuarioDTO;
    }
}
