package com.estilosDeAprendizagem.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AlunoRepository extends CrudRepository<Aluno, Long> {
    Iterable<Aluno> findByCurso(String curso);
}
