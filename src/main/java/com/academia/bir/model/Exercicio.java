package com.academia.bir.model;

import javax.persistence.*;

@Entity
public class Exercicio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	public Exercicio() {}

	public Exercicio(long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
