package com.rodrigo.biblioteca.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "generos")
public class Genero {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Genero() {}

    public Genero(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
