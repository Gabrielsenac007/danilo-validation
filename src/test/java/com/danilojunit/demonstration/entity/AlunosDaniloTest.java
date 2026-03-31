package com.danilojunit.demonstration.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunosDaniloTest {

    @Test
    @DisplayName("Should get user")
    void testCriacaoAluno() {
        AlunosDanilo aluno = new AlunosDanilo("1", "Gabriel", 20, "3A");

        assertEquals("Gabriel", aluno.getNome());
        assertEquals(20, aluno.getIdade());
        assertEquals("3A", aluno.getTurma());
    }

    @Test
    @DisplayName("Many assertions with assertAll")
    void testAtributosAluno() {
        AlunosDanilo aluno = new AlunosDanilo("10", "Maria", 16, "1C");

        assertAll(
                () -> assertEquals("10", aluno.getId()),
                () -> assertEquals("Maria", aluno.getNome()),
                () -> assertEquals(16, aluno.getIdade()),
                () -> assertEquals("1C", aluno.getTurma())
        );
    }



}
