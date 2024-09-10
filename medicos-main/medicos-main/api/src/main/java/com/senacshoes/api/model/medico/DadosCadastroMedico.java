package com.senacshoes.api.model.medico;

import com.senacshoes.api.model.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, String telefone ,Especialidades especialidade, DadosEndereco endereco) {

}
