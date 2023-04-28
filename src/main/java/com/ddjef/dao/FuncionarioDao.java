package com.ddjef.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.ddjef.domain.Funcionario;

public interface FuncionarioDao {
	
	void save(Funcionario f);
	
	void update(Funcionario f);
	
	void delete (Long id);
	
	Funcionario getById(Long id);
	
	List<Funcionario> getAll();
	
	List<Funcionario> getByRole(String role);
//	@Query("SELECT * FROM funcionarios f WHERE f.cargo = ?1")
//	List<Funcionario> getByRole(String cargo);

}
