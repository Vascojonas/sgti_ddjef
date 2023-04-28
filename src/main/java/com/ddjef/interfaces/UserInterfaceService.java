package com.ddjef.interfaces;

import java.util.List;

import com.ddjef.entity.User;

public interface UserInterfaceService {
	void save(User user);

	User update(User user);

	void delete(Long id);

	User findById(Long id);

	List<User> findAll();
}
