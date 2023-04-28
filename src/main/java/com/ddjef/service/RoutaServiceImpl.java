package com.ddjef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddjef.dao.FuncionarioDao;
import com.ddjef.dao.RoutaDao;
import com.ddjef.domain.Funcionario;
import com.ddjef.domain.Routa;

@Service 
@Transactional(readOnly = false)
public class RoutaServiceImpl implements RoutaService {

	
	@Autowired 
	private RoutaDao dao;
	
	@Override
	public void save(Routa r) {
		dao.save(r);
		
	}

	@Override
	public void update(Routa r) {
		dao.update(r);
		
	}

	@Override
	public void delete(Long id) {
		dao.delete(id);
		
	}
	

	@Override @Transactional(readOnly = true)
	public Routa getById(Long id) {
	
		return dao.getById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Routa> getAll() {
		
		return dao.getAll();
	}


}
