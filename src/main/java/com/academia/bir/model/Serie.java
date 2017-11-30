package com.academia.bir.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Serie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "repeticao")
	private String repeticao;

	@ElementCollection
    @CollectionTable(name = "exercicios", joinColumns = @JoinColumn(name = "serie_id"))
    @Column(name = "exercicios")
	private Set<Exercicio> exercicios = new HashSet<>();

	public Serie(long id, String tipo, String repeticao) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.repeticao = repeticao;
	}
	
	
}
