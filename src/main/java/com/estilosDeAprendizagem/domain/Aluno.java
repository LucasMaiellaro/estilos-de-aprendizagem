package com.estilosDeAprendizagem.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estiloDeAprendizagem;
    private String curso;
    private int idade;
    private String genero;
    private String semestre;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String estiloDeAprendizagem, String curso, int idade, String genero, String semestre) {
        this.id = id;
        this.nome = nome;
        this.estiloDeAprendizagem = estiloDeAprendizagem;
        this.curso = curso;
        this.idade = idade;
        this.genero = genero;
        this.semestre = semestre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstiloDeAprendizagem() {
        return estiloDeAprendizagem;
    }

    public void setEstiloDeAprendizagem(String estiloDeAprendizagem) {
        this.estiloDeAprendizagem = estiloDeAprendizagem;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

}
