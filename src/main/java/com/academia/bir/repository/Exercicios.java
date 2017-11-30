package com.academia.bir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.bir.model.Exercicio;

@Repository
public interface Exercicios extends JpaRepository<Exercicio, Long>{

}
