package com.senacshoes.api.model.medico;

import com.senacshoes.api.model.endereco.DadosEndereco;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(
    @NotNull
    Long id,
    String nome, 
    String telefone, 
    DadosEndereco endereco) { 
}
