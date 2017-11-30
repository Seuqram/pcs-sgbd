package com.academia.bir.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Exercicio;
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
		for (Serie serie : series.findAll()) {
			List<Exercicio> exercicios = new ArrayList<>();
			serie.getExercicios().forEach(exercicio -> exercicios.add(exercicio));
			for (int index = 0; index < 3; index++) {
				Exercicio exercicio = exercicios.get(index);
				serie.getExercicios_aux()[index] = exercicio;
			}
		}
		modelAndView.addObject("series", series.findAll());
		Serie serie = new Serie();
		modelAndView.addObject("serie", serie);
		return modelAndView;
	}

	@PostMapping
	public String salvar(Serie serie) {
		this.series.save(serie);
		return "redirect:/series";
	}
}
