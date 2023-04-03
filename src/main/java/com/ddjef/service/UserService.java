package com.ddjef.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddjef.entity.User;
import com.ddjef.repository.UserRepository;



@Service
@Transactional(readOnly = false)
public class UserService{
	@Autowired
	private UserRepository userRepository;


	@Transactional(readOnly = true)
	public List<User> findAll() {
		return userRepository.findAll();
	}

	
	public void save(User user) {
		user.setPassword("12345");
		userRepository.save(user);
	}

	
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	@Transactional(readOnly = true)
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}



	
}
