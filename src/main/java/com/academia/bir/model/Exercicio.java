package com.academia.bir.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
	@NotNull
	private String nome;

	@Column(name = "sequencia")
	@NotNull
	private String sequencia;

	@Column(name = "repeticoes")
	@NotNull
	private String repeticoes;
}
