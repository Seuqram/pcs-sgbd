package com.academia.bir.model;

import javax.persistence.*;

@Entity
public class Medida{
	
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
	
	public Medida() {}

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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getBraco_esquerdo() {
		return braco_esquerdo;
	}

	public void setBraco_esquerdo(float braco_esquerdo) {
		this.braco_esquerdo = braco_esquerdo;
	}

	public float getBraco_direito() {
		return braco_direito;
	}

	public void setBraco_direito(float braco_direito) {
		this.braco_direito = braco_direito;
	}

	public float getCoxa_esquerda() {
		return coxa_esquerda;
	}

	public void setCoxa_esquerda(float coxa_esquerda) {
		this.coxa_esquerda = coxa_esquerda;
	}

	public float getCoxa_direita() {
		return coxa_direita;
	}

	public void setCoxa_direita(float coxa_direita) {
		this.coxa_direita = coxa_direita;
	}

	public float getPeito() {
		return peito;
	}

	public void setPeito(float peito) {
		this.peito = peito;
	}

	public float getPercentual_gordura() {
		return percentual_gordura;
	}

	public void setPercentual_gordura(float percentual_gordura) {
		this.percentual_gordura = percentual_gordura;
	}

	public Resultado getResultado() {
		return resultado;
	}

	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
	
	
	
	
}
