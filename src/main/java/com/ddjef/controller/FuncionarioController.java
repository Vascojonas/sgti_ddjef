package com.ddjef.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ddjef.domain.Funcionario;
import com.ddjef.entity.Buse;
import com.ddjef.service.FuncionarioService;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

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
	
	@GetMapping("/listar/gestores")
	public String getGestores(ModelMap model) {
		model.addAttribute("funcionarios", service.getByRole("Gestor"));
		return "funcionarios/listar";
	}
	
	@GetMapping("/listar/motoristas")
	public String getMotorista(ModelMap model) {
		model.addAttribute("funcionarios", service.getByRole("Motorista"));
		return "funcionarios/listar";
	}
	
	@GetMapping("/listar/bilheteiros")
	public String getBilhoteiros(ModelMap model) {
		model.addAttribute("funcionarios", service.getByRole("Bilheteiro"));
		return "funcionarios/listar";
	}
	
	
	@GetMapping("/cadastrar")
	public String create(Funcionario funcionario ) {
		return "funcionarios/cadastrar";
	}
	
	@PostMapping("/salvar")
	public @ResponseBody  Map<String, Object> salvar(
			
			@RequestParam() String nome,
			@RequestParam() String apelido,
			@RequestParam() String telefone,
			@RequestParam() String email,
			@RequestParam() String tipo_doc,
			@RequestParam() String numero_doc,
			@RequestParam() String cargo){
		Funcionario funcionario = new Funcionario(nome,apelido,telefone,email,tipo_doc,numero_doc,cargo);
		
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);
		
		
		Map<String, Object> result = new HashMap<>();
		
		if(violations.isEmpty()) {
			
			service.save(funcionario);
			result.put("status", 200);
			result.put("message", "Usuário cadastrado com sucesso!");
			
		}else {
			 Map<String, Object> error = new HashMap<>();
				for (ConstraintViolation<Funcionario> violation : violations) {
				    error.put(violation.getPropertyPath().toString(), violation.getMessage());
				}
				
				result.put("status", 406);
				result.put("errorValidation", error);
		}
		

		    return result;
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("funcionario", service.getById(id));
		return "funcionarios/cadastrar";
		
	}
	
	@PostMapping("/actualizar")
	public @ResponseBody  Map<String, Object> actualizar(
			@RequestParam() Long id,
			@RequestParam() String nome,
			@RequestParam() String apelido,
			@RequestParam() String telefone,
			@RequestParam() String email,
			@RequestParam() String tipo_doc,
			@RequestParam() String numero_doc,
			@RequestParam() String cargo){
		Funcionario funcionario = new Funcionario(id, nome,apelido,telefone,email,tipo_doc,numero_doc,cargo);
		
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);
		
		
		Map<String, Object> result = new HashMap<>();
		
		if(violations.isEmpty()) {
			
			service.update(funcionario);
			result.put("status", 200);
			result.put("message", "Usuário actualizado com sucesso!");
			
		}else {
			 Map<String, Object> error = new HashMap<>();
				for (ConstraintViolation<Funcionario> violation : violations) {
				    error.put(violation.getPropertyPath().toString(), violation.getMessage());
				}
				
				result.put("status", 406);
				result.put("errorValidation", error);
		}
		

		    return result;
	}
	
	@DeleteMapping("/deletar")
	public @ResponseBody  Map<String, Object> deletar(@RequestParam() Long id){
		
		Map<String, Object> result = new HashMap<>();
		
		service.delete(id);
		
		result.put("status", 200);
		result.put("message", "Usuário deletado com sucesso!");
		
		return result;
	}
	
	
	

}
