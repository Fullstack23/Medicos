package com.senacshoes.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.senacshoes.api.model.paciente.DadosAtualizarPaciente;
import com.senacshoes.api.model.paciente.DadosCadastroPaciente;
import com.senacshoes.api.model.paciente.DadosListagemPaciente;
import com.senacshoes.api.model.paciente.Paciente;
import com.senacshoes.api.model.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public List<DadosListagemPaciente> listar() {
        return repository.findAll().stream().map(DadosListagemPaciente::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizarPaciente dados) {
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
