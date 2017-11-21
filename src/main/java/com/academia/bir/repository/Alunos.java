package com.academia.bir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.bir.model.Aluno;

public interface Alunos extends JpaRepository<Aluno, Long>{
}