package com.ljez.pa5.persistence.repository;

import com.ljez.pa5.persistence.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

Usuario findByEmailAndPassword(String email, String password);
}
