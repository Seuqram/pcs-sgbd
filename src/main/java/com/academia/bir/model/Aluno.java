package com.academia.bir.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.academia.bir.enums.Objetivo;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("1")
public class Aluno extends Pessoa {
	
	@Column(name = "objetivo")
	private String objetivo;

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
}
