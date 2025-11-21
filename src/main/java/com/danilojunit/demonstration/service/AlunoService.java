package com.danilojunit.demonstration.service;

import com.danilojunit.demonstration.entity.AlunosDanilo;
import com.danilojunit.demonstration.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repo;

    public AlunosDanilo salvar(AlunosDanilo aluno) {
        return repo.save(aluno);
    }

    public boolean validarIdade(AlunosDanilo aluno) {
        if (aluno.getIdade() == null || aluno.getIdade() <= 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        return true;
    }
}

