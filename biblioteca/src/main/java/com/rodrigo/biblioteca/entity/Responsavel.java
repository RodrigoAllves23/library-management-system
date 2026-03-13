package com.rodrigo.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "responsaveis")
public class Responsavel extends Pessoa{
    private String parentesco;

    @OneToMany(mappedBy = "responsavel")
    private List<Aluno> dependentes;

    public Responsavel() {}
    public Responsavel(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
