package com.academia.bir.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Exercicio {

	@Column(name = "nome")
	private String nome;

	@Column(name = "sequencia")
	private String sequencia;

	@Column(name = "repeticoes")
	private String repeticoes;
}
