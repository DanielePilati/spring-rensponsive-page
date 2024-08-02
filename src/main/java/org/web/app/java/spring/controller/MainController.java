package org.web.app.java.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping("/")
	public String empty(Model model) {
		return "home";
	}
	@GetMapping("/home")
	public String home(Model model) {	
		return "home";
	}
	@GetMapping("/calculator")
	public String calculator(Model model) {	
		return "calculator";
	}

}
