package com.ddjef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddjef.domain.Funcionario;

@Controller
@RequestMapping("/routas")
public class RouteController {

	@GetMapping("/listar")
	public String getAll() {
//		model.addAttribute("funcionarios", service.getAll());
		return "route/list";
	}
	
	
	@GetMapping("/cadastrar")
	public String create() {
		return "routes/create";
	}
	
	@GetMapping("/subroutas/cadastrar")
	public String createSubRoute() {
		return "routes/sub_route";
	}
}
