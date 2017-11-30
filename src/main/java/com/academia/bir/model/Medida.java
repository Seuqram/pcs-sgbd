package com.academia.bir.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Medida {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "braco_esquerdo")
	private float braco_esquerdo;

	@Column(name = "braco_direito")
	private float braco_direito;

	@Column(name = "coxa_esquerda")
	private float coxa_esquerda;

	@Column(name = "coxa_direita")
	private float coxa_direita;

	@Column(name = "peito")
	private float peito;

	@Column(name = "percentual_gordura")
	private float percentual_gordura;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resultado_id", nullable = false)
	private Resultado resultado;

	public Medida(long id, float braco_esquerdo, float braco_direito, float coxa_esquerda, float coxa_direita,
			float peito, float percentual_gordura) {
		super();
		this.id = id;
		this.braco_esquerdo = braco_esquerdo;
		this.braco_direito = braco_direito;
		this.coxa_esquerda = coxa_esquerda;
		this.coxa_direita = coxa_direita;
		this.peito = peito;
		this.percentual_gordura = percentual_gordura;
	}
}
