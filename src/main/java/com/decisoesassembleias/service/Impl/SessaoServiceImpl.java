//package com.decisoesassembleias.service.Impl;
//
//import com.decisoesassembleias.dto.NovaSessao;
//import com.decisoesassembleias.dto.SessaoDto;
//import com.decisoesassembleias.entities.Sessao;
//import com.decisoesassembleias.repository.SessaoRepository;
//import com.decisoesassembleias.service.SessaoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//@Service
//public class SessaoServiceImpl implements SessaoService {
//
//    @Autowired
//    SessaoRepository sessaoRepository;
//
//    public void cadastrarSessao(NovaSessao novaSessao) {
//        Sessao sessao = new Sessao();
//        sessao.setPauta(novaSessao.getPauta());
//        sessao.setAberta(true);
//        sessao.setTotalVotos(0);
//        sessao.setTotalAprovacoes(0);
//        sessao.setDataCriacao(LocalDateTime.now());
//        sessaoRepository.save(sessao);
//    }
//
//    public List<SessaoDto> listarSessoes(){
//        return new SessaoDto().sessaoDtoList(sessaoRepository.findAll());
//    }
//}
