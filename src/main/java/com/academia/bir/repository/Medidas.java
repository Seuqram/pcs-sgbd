package com.academia.bir.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.academia.bir.model.Medida;

@Repository
public interface Medidas extends CrudRepository<Medida, Long>{

}
