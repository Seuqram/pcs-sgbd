package com.academia.bir.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.bir.model.Pessoa;

public interface Pessoas extends JpaRepository<Pessoa, Long>{
}