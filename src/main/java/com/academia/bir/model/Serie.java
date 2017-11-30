package com.academia.bir.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "repeticao")
	private String repeticao;
	
	@Transient
	private Exercicio[] exercicios_aux = new Exercicio[3];

	@ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "serie_exercicios", joinColumns = @JoinColumn(name = "serie_id"))
	private Set<Exercicio> exercicios = new HashSet<>();
	
	@PrePersist
	public void prePersist() {
		for (Exercicio exercicio : exercicios_aux) {
			this.exercicios.add(exercicio);
		}
	}
	
	
}
