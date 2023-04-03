package com.ddjef.interfaces;

import com.ddjef.entity.User;

import java.util.List;

public interface UserInterfaceService {
	void save(User user);

	User update(User user);

	void delete(Long id);

	User findById(Long id);

	List<User> findAll();
}
