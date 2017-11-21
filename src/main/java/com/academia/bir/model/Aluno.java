package com.academia.bir.model;

import com.academia.bir.enums.Objetivo;

public class Aluno extends Pessoa{
	private Objetivo objetivo;

	public Objetivo getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(Objetivo objetivo) {
		this.objetivo = objetivo;
	}
}
