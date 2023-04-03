package com.ddjef.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ddjef.entity.User;



public interface UserRepository extends JpaRepository<User,Long>{

}
