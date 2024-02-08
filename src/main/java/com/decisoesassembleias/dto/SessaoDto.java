package com.decisoesassembleias.dto;

import com.decisoesassembleias.entities.Sessao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessaoDto {

    private Long id;

    private String pauta;
    private boolean aberta;
    private Integer totalVotos;
    private Integer totalAprovacoes;
    private LocalDateTime dataCriacao;

    public SessaoDto(Sessao sessao) {
        this.id = sessao.getId();
        this.pauta = sessao.getPauta();
        this.aberta = sessao.isAberta();
        this.totalVotos = sessao.getTotalVotos();
        this.totalAprovacoes = sessao.getTotalAprovacoes();
        this.dataCriacao = sessao.getDataCriacao();
    }

    public List<SessaoDto> sessaoDtoList(List<Sessao> sessoes) {
        return sessoes.stream().map(sessao -> new SessaoDto(sessao)).collect(Collectors.toList());
    }

}
