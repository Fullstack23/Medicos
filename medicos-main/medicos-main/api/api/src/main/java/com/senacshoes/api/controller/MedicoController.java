package com.senacshoes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senacshoes.api.medico.DadosAtualizarMedico;
import com.senacshoes.api.medico.DadosCadastroMedico;
import com.senacshoes.api.medico.DadosListagemMedico;
import com.senacshoes.api.medico.Medico;
import com.senacshoes.api.medico.MedicoRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

	@Autowired
	private MedicoRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		repository.save(new Medico(dados));
	}

	@GetMapping

	public List<DadosListagemMedico> listar() {
		return repository.findAll().stream().map(DadosListagemMedico::new).toList();
	} 

	@PutMapping
	@Transactional
	public void atualizado(@RequestBody DadosAtualizarMedico dados) {
		var medico = repository.getReferenceById(dados.id());
		medico.atualizarInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
//CONVERSÃO DE DADOSLISTAGEMMEIDCO, MEDICO.
