package com.estilosDeAprendizagem.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository rep;

    public Iterable<Aluno> getAlunos() {
        return rep.findAll();
    }

    public Optional<Aluno> getAlunoById(Long id) {
        return rep.findById(id);
    }

    public Iterable<Aluno> getAlunosByCurso(String curso) {
        return rep.findByCurso(curso);
    }

    public Aluno insert(Aluno aluno) {
        return rep.save(aluno);
    }

    public Aluno update(Aluno aluno, Long id) {
        Assert.notNull(id, "Não foi possível atualizar o registro.");

        Optional<Aluno> optional = getAlunoById(id);
        if (optional.isPresent()) {
            Aluno db = optional.get();
            db.setNome(aluno.getNome());
            db.setEstiloDeAprendizagem(aluno.getEstiloDeAprendizagem());
            db.setCurso(aluno.getCurso());
            db.setIdade(aluno.getIdade());
            db.setGenero(aluno.getGenero());
            db.setSemestre(aluno.getSemestre());

            rep.save(db);
            return db;
        } else {
            throw new RuntimeException("Não foi possível atualizar o registro.");
        }
    }

    public void delete(Long id) {
        Optional<Aluno> aluno = getAlunoById(id);
        if(aluno.isPresent())
            rep.deleteById(id);
    }
}
