package com.senacshoes.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senacshoes.api.medico.DadosCadastroMedico;
import com.senacshoes.api.medico.Medico;
import com.senacshoes.api.medico.MedicoRepository;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	MedicoRepository repository;

	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		repository.save(new Medico());
		// System.out.println(dados);
	}
}
