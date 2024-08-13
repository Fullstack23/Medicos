package com.senacshoes.api.medico;

import com.senacshoes.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidades especialidade, DadosEndereco endereco) {

}
