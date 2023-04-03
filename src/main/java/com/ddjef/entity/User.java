package com.ddjef.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
public class User extends AbstractEntity<Long> {
	
	@NotBlank(message = "O campo nome é obrigatorio")
	@Size(min=3, max=50, message = "O nome deve ter entre {min} e {max} caracteres")
	@Column(nullable=false, length=50)
	private String firstName;
	
	@NotBlank(message = "O campo apelido é obrigatorio")
	@Size(min=1, max=50, message = "O apelido deve ter entre {min} e {max} caracteres")
	@Column(nullable=false, length=50)
	private String lastName;
	
	@NotBlank(message = "O campo email é obrigatorio")
	@Size(min=3, max=100, message = "O email deve ter entre {min} e {max} caracteres")
	@Column(nullable=false, length=100, unique=true)
	private String email;
	
	@Column(nullable=false, length=64)
	private String password;
	
	@Column(nullable=false, length = 1, columnDefinition = "char default 0")
	private char status;
	
	@ManyToOne(fetch = FetchType.LAZY, optional=false)
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	public User(String firstName, String lastName, String email, Role role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
	}
	public User() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

}
