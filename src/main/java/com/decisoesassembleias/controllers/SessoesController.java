package com.decisoesassembleias.controllers;

import com.decisoesassembleias.dto.NovaSessao;
import com.decisoesassembleias.dto.SessaoDto;
import com.decisoesassembleias.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessoesController {

    @Autowired
    SessaoService sessaoService;

    @ResponseBody
    @GetMapping("/sessoes")
    public String listaSessoes() {
        return "Funcionando perfeitamente";
    }

    @ResponseBody
    @PostMapping("/sessoes")
    public ResponseEntity cadastrarSessao(@RequestBody NovaSessao novaSessao){
        sessaoService.cadastrarSessao(novaSessao);
        return ResponseEntity.ok("Sessão criada");
    }
}
