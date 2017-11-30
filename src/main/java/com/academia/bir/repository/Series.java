package com.academia.bir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.academia.bir.model.Serie;

@Repository
public interface Series extends JpaRepository<Serie, Long>{

}
