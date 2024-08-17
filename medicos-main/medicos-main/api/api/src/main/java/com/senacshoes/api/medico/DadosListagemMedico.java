package com.senacshoes.api.medico;

public record DadosListagemMedico(String nome, String email,String crm, 
Especialidades especialide) {

    public DadosListagemMedico(Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(), 
        medico.getEspecialidade());
        
    }
}
