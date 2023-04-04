package com.ddjef.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/")
public class HomeController {

	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/dashboard")
	public String dasboard() {
		return "dashboard/admin";
	}
	
}
