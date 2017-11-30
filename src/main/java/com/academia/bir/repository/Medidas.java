package com.academia.bir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.academia.bir.model.Medida;

@Repository
public interface Medidas extends JpaRepository<Medida, Long>{

}
