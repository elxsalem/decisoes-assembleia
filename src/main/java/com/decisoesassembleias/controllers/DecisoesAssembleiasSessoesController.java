package com.decisoesassembleias.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DecisoesAssembleiasSessoesController {

    @ResponseBody
    @GetMapping("/sessoes")
    public String listaSessoes() {
        return "Funcionando perfeitamente";
    }
}
