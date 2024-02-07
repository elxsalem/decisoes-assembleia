package com.decisoesassembleias.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="tb_sessao")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pauta;
    private boolean aberta;
    private Integer totalVotos;
    private Integer totalAprovacoes;
    private LocalDateTime dataCriacao;

}
