package com.senacshoes.api.paciente;

import com.senacshoes.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {

}
