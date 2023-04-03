package com.ddjef.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;


@SuppressWarnings("serial")
@Entity
public class Role extends AbstractEntity<Long> {
	
	@Column(nullable = false, length = 100, unique = true)
	private String name;
	
	@Column(columnDefinition = "text")
	private String description;
	
	
	@OneToMany()
	@JoinColumn(name = "role_id")
	private List<User> users;


	public Role(String name, String description, List<User> users) {
		super();
		this.name = name;
		this.description = description;
		this.users = users;
	}


	public Role() {
		super();
	}


	public Role(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String toString() {
		return this.getName();
	}
	

}
