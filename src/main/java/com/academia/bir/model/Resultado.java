package com.academia.bir.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;

@Entity
public class Resultado implements Serializable{

	@Id
	@GeneratedValue
	private long id;
	
	private Date data_de_cadastro;
	private Medida medidas;
	private Aluno aluno;
	
	@PrePersist
	void onCreate() {
		this.setData_de_cadastro(new Date());
	}
	public Date getData_de_cadastro() {
		return data_de_cadastro;
	}

	public void setData_de_cadastro(Date data_de_cadastro) {
		this.data_de_cadastro = data_de_cadastro;
	}
	public Medida getMedidas() {
		return medidas;
	}
	public void setMedidas(Medida medidas) {
		this.medidas = medidas;
	}
	public Aluno getAluno() {
		return aluno;
	}
}
