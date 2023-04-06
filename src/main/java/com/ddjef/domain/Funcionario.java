package com.ddjef.domain;

import jakarta.persistence.*;


@Entity
@SuppressWarnings("serial")

@Table(name = "FUNCIONARIOS")

public class Funcionario extends AbstractEntity<Long> {
	
	@Column(name ="nome", length=60)
	private String nome;
	
	@Column(name ="apelido", length=60)
	private String apelido;
	
	@Column(name ="telefone", length=20)
	private String telefone;
	
	@Column(name ="email", length=20)
	private String email;
	
	@Column(name ="tipo_doc", length=20)
	private String tipo_doc;
	
	@Column(name ="numero_doc", length=60)
	private String numero_doc;
	
	@Column(name ="cargo", length=60)
	private String cargo;
}
