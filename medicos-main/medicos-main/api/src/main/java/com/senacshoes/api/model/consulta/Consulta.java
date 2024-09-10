package com.senacshoes.api.model.consulta;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.senacshoes.api.model.medico.Medico;
import com.senacshoes.api.model.paciente.Paciente;

import jakarta.persistence.*;

@Table(name = "consultas")
@Entity(name = "Consulta")
public class Consulta implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDoAgendamento = LocalDate.now();

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDaConsulta;

    private Status status;

    private Prioridade prioridade;

    private String observacoes;

    @JoinColumn(name = "medico_id")
    private Medico medico;

    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    // Muitos para um
    // um para Muitos
    // muitos para muitos

}
