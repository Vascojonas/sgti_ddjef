package com.ddjef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddjef.dao.FuncionarioDao;
import com.ddjef.domain.Funcionario;

@Service 
@Transactional(readOnly = false)
public class FuncionarioServiceImpl implements FuncionarioService {

	
	@Autowired 
	private FuncionarioDao dao;
	
	@Override
	public void save(Funcionario f) {
		dao.save(f);
		
	}

	@Override
	public void update(Funcionario f) {
		dao.update(f);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}
	

	@Override @Transactional(readOnly = true)
	public Funcionario getById(Long id) {
	
		return dao.getById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Funcionario> getAll() {
		
		return dao.getAll();
	}


}
