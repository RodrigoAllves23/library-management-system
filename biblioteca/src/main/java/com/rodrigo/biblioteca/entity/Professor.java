package com.rodrigo.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "professores")
public class Professor extends Pessoa{
    private String departamento;
    private String registroProfissional;

    public Professor() {}
}
