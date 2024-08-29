package com.example.demo.persistence.repository;
import com.example.demo.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public static Usuario findByUsuarioAndClave(String usuario, String clave) {
        return null;
    }
}