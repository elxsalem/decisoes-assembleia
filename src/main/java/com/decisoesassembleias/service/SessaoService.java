package com.decisoesassembleias.service;

import com.decisoesassembleias.dto.NovaSessao;
import com.decisoesassembleias.dto.SessaoDto;

import java.util.List;

public interface SessaoService {
    void cadastrarSessao(NovaSessao novaSessao);
    List<SessaoDto> listarSessoes();
}
