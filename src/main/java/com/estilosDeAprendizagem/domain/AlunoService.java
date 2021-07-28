package com.estilosDeAprendizagem.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository rep;

    public Iterable<Aluno> getAlunos() {
        return rep.findAll();
    }

    public List<Aluno> getAlunosFake() {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1L, "Lucas Rufino Maiellaro", "Lobo", "ADS", 19, "Masculino", "4º Semestre"));
        alunos.add(new Aluno(2L, "Arthur Viveiros", "Gato", "ADS", 19, "Masculino", "4º Semestre"));
        alunos.add(new Aluno(3L, "Ana Beatriz Barbosa Alves", "Tubarão", "ADS", 18, "Feminino", "4º Semestre"));

        return alunos;
    }

}
