package com.danilojunit.demonstration.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alunos")
public class AlunosDanilo {

    @Id
    private String id;

    private String nome;
    private Integer idade;
    private String turma;

}
