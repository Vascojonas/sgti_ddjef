package com.ddjef.entity;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Province extends AbstractEntity<Long>{
    @NotBlank(message = "O campo nome é obrigatorio")
	@Size(min=3, max=50, message = "O nome deve ter entre {min} e {max} caracteres")
	@Column(nullable=false, length=50)
	private String name;
	
	
}
