package com.ddjef.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.ddjef.entity.Role;
import com.ddjef.entity.User;
import com.ddjef.service.RoleService;
import com.ddjef.service.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	RoleService roleService;
	
	@Autowired
	UserService userService;
	
	
	
	@GetMapping("/show")
	public String show( ModelMap model ) {
		model.addAttribute("users",userService.findAll());
		return "users/show";
	}
	@GetMapping("/create")
	public String create( Model model ) {
		model.addAttribute("user",new User());
		return "users/create";
	}
	@PostMapping("/save")
	public String save(@Valid User user, BindingResult result, ModelMap model, RedirectAttributes attr) {
		if (result.hasErrors()) {// verifica se campos têm erros
			return "users/create";
		}
		System.out.println(user.getRole());
		userService.save(user);
		attr.addFlashAttribute("success", "Usuario gravado com sucesso");
		return "redirect:/show";
	}

	@GetMapping("/register")
    public String userCreate () {
		return "client/createAccount";
       
	}

	
	@ModelAttribute("roles")
	public List<Role> getRoles(){
		return roleService.findAll();
	} 
	
}
