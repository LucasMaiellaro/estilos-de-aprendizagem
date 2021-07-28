package com.estilosDeAprendizagem.api;

import com.estilosDeAprendizagem.domain.Aluno;
import com.estilosDeAprendizagem.domain.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunosController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public Iterable<Aluno> getAlunos() {
        return service.getAlunos();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> getAlunosById(@PathVariable("id") Long id) {
        return service.getAlunoById(id);
    }

    @GetMapping("/curso/{curso}")
    public Iterable<Aluno> getAlunosByCurso(@PathVariable("curso") String curso) {
        return service.getAlunosByCurso(curso);
    }

    @PostMapping
    public String insert(@RequestBody Aluno aluno) {
        Aluno a = service.insert(aluno);

        return "Aluno salvo com sucesso: " + a.getId();
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id, @RequestBody Aluno aluno) {
        Aluno a = service.update(aluno, id);

        return "Aluno atualizado com sucesso: " + a.getId();
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id) {
        service.delete(id);

        return "Aluno deletado com sucesso";
    }

}
