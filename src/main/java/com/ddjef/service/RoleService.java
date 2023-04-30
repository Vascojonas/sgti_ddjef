package com.ddjef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddjef.entity.Role;
import com.ddjef.interfaces.RoleInterfaceService;
import com.ddjef.repository.RoleRepository;

@Service
@Transactional(readOnly = false)
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	
	public void save(Role role) {
		
		roleRepository.save(role);
	}

	
	public Role update(Role role) {
		return roleRepository.save(role);
	}

	public void delete(Role role) {
		roleRepository.delete(role);

	}

	
	@Transactional(readOnly = true)
	public Role findById(Long id) {
		return roleRepository.findById(id).orElse(null);
	}

	
	@Transactional(readOnly = true)
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
