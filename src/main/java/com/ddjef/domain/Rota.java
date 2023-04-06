package com.ddjef.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "FUNCIONARIOS")
public class Rota extends AbstractEntity<Long>{
	
	@Column(name ="nome", unique=true ,length=60)
	private String nome;
}
