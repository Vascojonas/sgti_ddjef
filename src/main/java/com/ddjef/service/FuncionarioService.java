package com.ddjef.service;

import java.util.List;

import com.ddjef.domain.Funcionario;


public interface FuncionarioService {
	
	void save(Funcionario f);
	
	void update(Funcionario f);
	
	void delete (Long id);
	
	Funcionario getById(Long id);
	
	List<Funcionario> getAll();
	
	List<Funcionario> getByRole(String role);

}
