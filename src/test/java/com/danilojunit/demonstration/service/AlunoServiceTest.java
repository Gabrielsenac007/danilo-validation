package com.danilojunit.demonstration.service;

import com.danilojunit.demonstration.entity.AlunosDanilo;
import com.danilojunit.demonstration.repository.AlunoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
public class AlunoServiceTest {

    @Mock
    private AlunoRepository repo;

    @InjectMocks
    private AlunoService service;


    @Test
    @DisplayName("Should validity age")
    void testValidacaoIdadeInvalida() {
        AlunoService service = new AlunoService();
        AlunosDanilo aluno = new AlunosDanilo("1", "João", 18, "3A");

        assertThrows(IllegalArgumentException.class, () -> service.validarIdade(aluno));
    }

    @Test
    void testSalvarAluno() {
        AlunosDanilo aluno = new AlunosDanilo("1", "Carlos", 18, "2B");

        when(repo.save(any())).thenReturn(aluno);

        AlunosDanilo salvo = service.salvar(aluno);

        assertEquals("Carlos", salvo.getNome());
        verify(repo, times(1)).save(aluno);
    }

}
