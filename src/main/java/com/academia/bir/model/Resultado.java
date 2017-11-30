package com.academia.bir.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "resultados")
@NoArgsConstructor
@Getter
@Setter
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
	
	@Column(name = "perfil_cadastrante")
	private String perfil_cadastrante;

	@PrePersist
	private void patati() {
		this.data_de_cadastro = Calendar.getInstance().getTime();
		this.medida.setResultado(this);
		this.perfil_cadastrante = "1";
	}

	public Resultado(long id, Date data_de_cadastro, Aluno aluno) {
		super();
		this.id = id;
		this.data_de_cadastro = data_de_cadastro;
		this.aluno = aluno;
	}
}
