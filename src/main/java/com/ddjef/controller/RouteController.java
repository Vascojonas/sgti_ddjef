package com.ddjef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ddjef.domain.Funcionario;
import com.ddjef.domain.Pronvicia;
import com.ddjef.domain.Routa;
import com.ddjef.service.FuncionarioService;
import com.ddjef.service.RoutaService;

@Controller
@RequestMapping("/routas")
public class RouteController {
	
	
	@Autowired
	private RoutaService service;
	
	@GetMapping("/listar")
	public String getAll(ModelMap model) {
		model.addAttribute("routas", service.getAll());
		return "routes/list";
	}
	
	
	@GetMapping("/cadastrar")
	public String create(Routa routa) {
		return "routes/create";
	}
	
	@GetMapping("/subroutas/cadastrar")
	public String createSubRoute() {
		return "routes/sub_route";
	}
	
	@PostMapping("/salvar")
	public String salvar(Routa routa, RedirectAttributes attr) {
		service.save(routa);
		attr.addFlashAttribute("success", "Routa inserida com sucesso");
		return "redirect:/funcionarios/cadastrar";
	}
	
	@ModelAttribute("pronvicias")
	
	public Pronvicia[] getPronvincias() {
		
		return Pronvicia.values();
	}
}
