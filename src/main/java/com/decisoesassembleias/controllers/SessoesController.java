package com.decisoesassembleias.controllers;

import com.decisoesassembleias.dto.NovaSessao;
import com.decisoesassembleias.dto.SessaoDto;
import com.decisoesassembleias.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SessoesController {

    @Autowired
    SessaoService sessaoService;

    @ResponseBody
    @GetMapping("/sessoes")
    public ResponseEntity<List<SessaoDto>> listarSessoes() {
        return ResponseEntity.ok(sessaoService.listarSessoes());
    }

//    @ResponseBody
//    @GetMapping("/sessoes/abertas")
//    public ResponseEntity<List<SessaoDto>> listarSessoesAberta() {
//        return ResponseEntity.ok(sessaoService.listarSessoesAberta());
//    }

    @ResponseBody
    @PostMapping("/sessoes")
    public ResponseEntity cadastrarSessao(@RequestBody NovaSessao novaSessao){
        sessaoService.cadastrarSessao(novaSessao);
        return ResponseEntity.ok("Sessão criada");
    }
}
