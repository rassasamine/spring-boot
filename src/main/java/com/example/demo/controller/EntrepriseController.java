package com.example.demo.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntrepriseController {
	
	@GetMapping("/listeentreprise")
	public String allEntrepprise() {
		return "index";
	}
	

}

