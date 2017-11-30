package com.academia.bir.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Aluno;

@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("Home");
		
		return modelAndView;
	}
}
