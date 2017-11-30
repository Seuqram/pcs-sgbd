package com.academia.bir.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Inheritance
@DiscriminatorColumn(name = "pessoa_tipo")
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
	
	public Long getMatricula() {
		return matricula;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
