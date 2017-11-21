package com.academia.bir.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.academia.bir.enums.Objetivo;

@Entity
@DiscriminatorValue("1")
public class Aluno extends Pessoa{
	private Objetivo objetivo;

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
}
