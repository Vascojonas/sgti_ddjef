package com.ddjef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {
	
	@GetMapping("/listar")
	public String getAll() {
		return "funcionarios/listar";
	}
	
	
	@GetMapping("/cadastrar")
	public String create() {
		return "funcionarios/cadastrar";
	}

}
