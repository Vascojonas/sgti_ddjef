package com.ddjef.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@SuppressWarnings("serial")

@Table(name = "FUNCIONARIOS")

public class Funcionario extends AbstractEntity<Long> {
	
	
	@Size(min = 3, max = 60, message 
		      = "O campo  nome deve ter entre 3 e 60 caracteres")
	@Column(name ="nome", length=60)
	private String nome;
	
	
	@Size(min = 3, max = 60, message 
		      = "O campo apelido deve ter entre {min} e {max} caracteres")
	@Column(name ="apelido", length=60)
	private String apelido;
	
	@NotBlank(message = "O campo telefone é obrigatorio")
	@Column(name ="telefone", length=20)
	private String telefone;
	
	@NotBlank(message = "O email deve ser válido")
	@Column(name ="email", length=100)
	private String email;
	
	@NotBlank(message = "O tipo de documento é obrigatório")
	@Column(name ="tipo_doc", length=20)
	private String tipo_doc;
	
	@NotBlank(message = "O número do documento é obrigatorio")
	@Column(name ="numero_doc", length=60)
	private String numero_doc;
	
	@NotBlank(message = "O campo cargo é obrigatorio")
	@Column(name ="cargo", length=60, columnDefinition = "enum('Gestor', 'Motorista', 'Bilheteiro')")
	private String cargo;

	
	
	
	public Funcionario() {
		
	}
	public Funcionario(String nome, String apelido, String telefone, String email, String tipo_doc, String numero_doc,
			String cargo) {
		super();
		this.nome = nome;
		this.apelido = apelido;
		this.telefone = telefone;
		this.email = email;
		this.tipo_doc = tipo_doc;
		this.numero_doc = numero_doc;
		this.cargo = cargo;
	}
	
	public Funcionario(Long id ,String nome, String apelido, String telefone, String email, String tipo_doc, String numero_doc,
			String cargo) {
		super(id);
		this.nome = nome;
		this.apelido = apelido;
		this.telefone = telefone;
		this.email = email;
		this.tipo_doc = tipo_doc;
		this.numero_doc = numero_doc;
		this.cargo = cargo;
	}

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
