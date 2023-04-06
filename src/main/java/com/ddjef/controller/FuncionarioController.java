package com.ddjef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddjef.domain.Funcionario;
import com.ddjef.service.FuncionarioService;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService service;
	
	@GetMapping("/listar")
	public String getAll(ModelMap model) {
		model.addAttribute("funcionarios", service.getAll());
		return "funcionarios/listar";
	}
	
	
	@GetMapping("/cadastrar")
	public String create(Funcionario funcionario) {
		return "funcionarios/cadastrar";
	}
	
	@PostMapping("/salvar")
	public String salvar(Funcionario funcionario) {
		service.save(funcionario);
		return "redirect:/funcionarios/cadastrar";
	}

}
