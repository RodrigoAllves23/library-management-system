package com.rodrigo.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "alunos")
@Getter
@Setter
public class Aluno extends Pessoa{

    private String matricula;
    private String turma;

    @ManyToOne
    @JoinColumn(name = "respnsalve_id")
    private responsavel;

    public Aluno() {}
    public Aluno(String matricula, String turma) {
        this.matricula = matricula;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

}
