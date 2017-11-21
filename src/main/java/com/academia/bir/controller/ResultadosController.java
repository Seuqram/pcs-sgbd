package com.academia.bir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Resultado;
import com.academia.bir.repository.Resultados;

@Controller
@RequestMapping("/resultados")
public class ResultadosController {
	@Autowired
	private Resultados resultados;
	
	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("ListaResultados");
		
		modelAndView.addObject("resultados", resultados.findAll());
		Resultado novoResultado = new Resultado();
		modelAndView.addObject("resultado", new Resultado());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Resultado resultado) {
		this.resultados.save(resultado);
		return "redirect:/resultados";
	}

}
