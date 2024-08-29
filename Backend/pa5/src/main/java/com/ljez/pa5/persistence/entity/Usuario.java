package com.ljez.pa5.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {
    @Id
    @GeneratedValue
    private int id;
    @Basic
    private String username;
    @Column(unique = true)
    private String email;
    private String password;

}
