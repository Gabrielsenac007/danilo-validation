package com.danilojunit.demonstration.repository;

import com.danilojunit.demonstration.entity.AlunosDanilo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunosDanilo, String> {}

