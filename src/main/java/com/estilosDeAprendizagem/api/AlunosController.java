package com.estilosDeAprendizagem.api;

import com.estilosDeAprendizagem.domain.Aluno;
import com.estilosDeAprendizagem.domain.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunosController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public Iterable<Aluno> get() {
        return service.getAlunos();
    }
}
