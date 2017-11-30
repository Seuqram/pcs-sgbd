package com.academia.bir.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "resultados")
public class Resultado {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "data_cadastro")
	private Date data_de_cadastro;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "resultado")
	private Medida medida;

	@Column(name = "aluno")
	private Aluno aluno;
	
	@PrePersist
	private void patati() {
		this.data_de_cadastro = Calendar.getInstance().getTime();
		this.medida.setResultado(this);
	}

	public Resultado() {
	}

	public Resultado(long id, Date data_de_cadastro, Aluno aluno) {
		super();
		this.id = id;
		this.data_de_cadastro = data_de_cadastro;
		this.aluno = aluno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getData_de_cadastro() {
		return data_de_cadastro;
	}

	public void setData_de_cadastro(Date data_de_cadastro) {
		this.data_de_cadastro = data_de_cadastro;
	}

	public Medida getMedida() {
		return medida;
	}

	public void setMedida(Medida medida) {
		this.medida = medida;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}
