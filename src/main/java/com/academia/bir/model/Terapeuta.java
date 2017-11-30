package com.academia.bir.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
@DiscriminatorValue("2")
@Getter
@Setter
public class Terapeuta extends Pessoa {

	@Column(name = "crefito")
	private int crefito;
}
