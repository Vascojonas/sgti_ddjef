package com.ddjef.dao;


import java.util.List;

import jakarta.persistence.TypedQuery;


import org.springframework.stereotype.Repository;

import com.ddjef.domain.Funcionario;


@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

	
	@Override
	public List<Funcionario> getByRole(String role) {
		TypedQuery<Funcionario> query= getEntityManager()
				.createQuery("select f from Funcionario f where f.cargo= :role", Funcionario.class);
		
		query.setParameter("role", role);
		return query.getResultList();
		
		
	}


}
