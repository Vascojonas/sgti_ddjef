//package com.ddjef.domain;
//
//import java.util.Collection;
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "Roles")
//public class Role extends AbstractEntity<Long>{
//	
//	@Column(name ="nome" ,length=60)
//	 private String nome;
//	    @ManyToMany(mappedBy = "roles")
//	    private Collection<User> users;
//		
//	    
//	    public String getNome() {
//			return nome;
//		}
//		public void setNome(String nome) {
//			this.nome = nome;
//		}
//		public Collection<User> getUsers() {
//			return users;
//		}
//		public void setUsers(Collection<User> users) {
//			this.users = users;
//		}
//	    
//	    
//	
//	
//}
