package com.decisoesassembleias.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SessaoDto {

    private String pauta;
    private boolean aberta;
    private Integer totalVotos;
    private Integer totalAprovacoes;
    private LocalDateTime dataCriacao;

}
