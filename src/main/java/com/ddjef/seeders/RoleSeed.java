package com.ddjef.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ddjef.service.RoleService;
import com.ddjef.entity.Role;
@Component
public class RoleSeed  implements CommandLineRunner{

	@Autowired
	private RoleService roleService;
	@Override
	public void run(String... args) throws Exception {
		loadRoleData();
		
	}
	
	private void loadRoleData() {
		
		if(roleService.findAll().size()==0) {
			Role r1=new Role("admin");
			Role r2=new Role("gestor");
			Role r3=new Role("cliente");
			Role r4=new Role("motorista");
			roleService.save(r1);
			roleService.save(r2);
			roleService.save(r3);
			roleService.save(r4);
		}
		
		
		
		
	}

}
