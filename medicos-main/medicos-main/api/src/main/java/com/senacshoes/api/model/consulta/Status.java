package com.senacshoes.api.model.consulta;

import lombok.*;

@Getter
@AllArgsConstructor
public enum Status {
    ABERTO(0, "ABERTO"), 
    ANDAMENTO(1,"ANDAMENTO"), 
    ENCERRADO(2,"ENCERRADO");

    private Integer codigo;
    private String descricao;
}
