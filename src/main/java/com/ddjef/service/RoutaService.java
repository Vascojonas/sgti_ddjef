package com.ddjef.service;

import java.util.List;

import com.ddjef.domain.Funcionario;
import com.ddjef.domain.Routa;


public interface RoutaService {
	
	void save(Routa r);
	
	void update(Routa r);
	
	void delete (Long id);
	
	Routa getById(Long id);
	
	List<Routa> getAll();

}
