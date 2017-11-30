package com.academia.bir.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("2")
public class Terapeuta extends Pessoa {

	@Column(name = "crefito")
	private int crefito;

	public int getObjetivo() {
		return crefito;
	}

	public void setObjetivo(int crefito) {
		this.crefito = crefito;
	}
}
