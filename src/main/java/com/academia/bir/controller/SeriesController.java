package com.academia.bir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Serie;
import com.academia.bir.repository.Series;

@Controller
@RequestMapping("/series")
public class SeriesController {
	@Autowired
	private Series series;
	
	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("listaSeries");
		
		modelAndView.addObject("series", series.findAll());
		modelAndView.addObject("serie", new Serie());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Serie serie) {
		this.series.save(serie);
		return "redirect:/exercicios";
	}
}
