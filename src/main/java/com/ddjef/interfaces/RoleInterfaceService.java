package com.ddjef.interfaces;

import java.util.List;

import com.ddjef.entity.Role;
public interface RoleInterfaceService {
	void save(Role role);

	Role update(Role role);

	void delete(Long id);

	Role findById(Long id);

	List<Role> findAll();

}
