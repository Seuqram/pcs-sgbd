package com.academia.bir.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.PrePersist;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@Inheritance
@DiscriminatorColumn(name = "pessoa_tipo")
@Getter @Setter
public abstract class Pessoa implements Serializable{
	@Id
	@GeneratedValue
	private Long matricula;
	
	private String nome;
	private String endereco;
	private int cpf;
	private Date data_nascimento;
	private String email;
	private String telefone;
	private String password;
	
	
	@PrePersist
	public void prePersist() {
		this.password = "academia-bir";
	}
	
}
