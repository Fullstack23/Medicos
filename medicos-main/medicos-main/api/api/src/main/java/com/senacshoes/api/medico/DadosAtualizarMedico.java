package com.senacshoes.api.medico;

import com.senacshoes.api.endereco.DadosEndereco;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarMedico(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {

}
