package com.academia.bir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Exercicio;
import com.academia.bir.model.Resultado;
import com.academia.bir.repository.Exercicios;

@Controller
@RequestMapping("/exercicios")
public class ExerciciosController {
	@Autowired
	private Exercicios exercicios;

	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("listaExercicios");
		
		modelAndView.addObject("exercicios", exercicios.findAll());
		modelAndView.addObject("exercicio", new Exercicio());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Exercicio exercicio) {
		this.exercicios.save(exercicio);
		return "redirect:/exercicios";
	}
}
