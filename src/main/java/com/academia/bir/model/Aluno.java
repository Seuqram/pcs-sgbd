package com.academia.bir.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("1")
@Getter @Setter
public class Aluno extends Pessoa {
	
	@Column(name = "objetivo")
	private String objetivo;
}
