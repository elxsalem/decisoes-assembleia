package com.decisoesassembleias.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="tb_sessao")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pauta;
    private boolean aberta;
    private Integer totalVotos;
    private Integer totalAprovacoes;
    private LocalDateTime dataCriacao;

}
