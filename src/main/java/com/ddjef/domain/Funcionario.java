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
	
	@Column(name ="email", length=100)
	private String email;
	
	@Column(name ="tipo_doc", length=20)
	private String tipo_doc;
	
	@Column(name ="numero_doc", length=60)
	private String numero_doc;
	
	@Column(name ="cargo", length=60, columnDefinition = "enum('Gestor', 'Motorista', 'Bilheteiro')")
	private String cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getNumero_doc() {
		return numero_doc;
	}

	public void setNumero_doc(String numero_doc) {
		this.numero_doc = numero_doc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
