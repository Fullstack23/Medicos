package com.senacshoes.api.model.paciente;

import com.senacshoes.api.model.endereco.DadosEndereco;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(

        @NotNull Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
