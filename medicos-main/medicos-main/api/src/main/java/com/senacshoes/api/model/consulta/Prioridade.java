package com.senacshoes.api.model.consulta;

import lombok.*;

@Getter
@AllArgsConstructor
public enum Prioridade {
    BAIXA(0, "BAIXA"),
    MEDIA(1, "MEDIA"),
    ALTA(2, "ALTA");

    private Integer codico;
    private String descricao;
}
