package com.academia.bir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.academia.bir.model.Aluno;
import com.academia.bir.repository.Alunos;

@Controller
@RequestMapping("/alunos")
public class AlunosController {
	@Autowired
	private Alunos alunos;
	
	@GetMapping
	public ModelAndView listar() { 
		ModelAndView modelAndView = new ModelAndView("ListaAlunos");
		
		modelAndView.addObject("alunos", alunos.findAll());
		modelAndView.addObject("aluno", new Aluno());
		
		return modelAndView;
	}
	
	@PostMapping
	public String salvar(Aluno aluno) {
		this.alunos.save(aluno);
		return "redirect:/alunos";
	}
}
