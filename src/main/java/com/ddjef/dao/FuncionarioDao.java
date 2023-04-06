package com.ddjef.dao;

import java.util.List;

import com.ddjef.domain.Funcionario;

public interface FuncionarioDao {
	
	void save(Funcionario f);
	
	void update(Funcionario f);
	
	void delete (Long id);
	
	Funcionario getById(Long id);
	
	List<Funcionario> getAll();

}
