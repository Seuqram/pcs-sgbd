package com.academia.bir.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Medida implements Serializable{
	
	@Id
	@GeneratedValue
	private long id;
	
	private float braco_esquerdo;
	private float braco_direito;
	private float coxa_esquerda;
	private float coxa_direita;
	private float peito;
	private float percentual_gordura;
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
	
	
}
