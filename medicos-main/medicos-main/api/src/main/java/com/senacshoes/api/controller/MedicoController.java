package com.senacshoes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.senacshoes.api.model.medico.DadosAtualizarMedico;
import com.senacshoes.api.model.medico.DadosCadastroMedico;
import com.senacshoes.api.model.medico.DadosListagemMedico;
import com.senacshoes.api.model.medico.Medico;
import com.senacshoes.api.model.medico.MedicoRepository;

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
	public void atualizar(@RequestBody DadosAtualizarMedico dados) {
		var medico = repository.getReferenceById(dados.id());
		medico.atualizarInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	@Transactional
	public void excluir(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
