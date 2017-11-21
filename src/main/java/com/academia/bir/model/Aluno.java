package com.academia.bir.model;

import javax.persistence.Entity;

import com.academia.bir.enums.Objetivo;

@Entity
public class Aluno extends Pessoa{
	private Objetivo objetivo;

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
}
