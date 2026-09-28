package com.senai.aula06.controller;

import com.senai.aula06.Aula06Application;
// Importa a anotação responsável por criar uma rota HTTP do tipo GET
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// Importa a anotação que indica que esta classe será um Controller REST
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController {
        private final Aula06Application aula06Application;

        SaudacaoController(Aula06Application aula06Application) {
        this.aula06Application = aula06Application;
    }

    // Cria um endpoint HTTP do tipo GET.
    // Quando o usuário acessar:
    // http://localhost:8080/hello
    // o Spring executará o método hello(). 
    @GetMapping("/saudacao")
    public String saudacao(@RequestParam String nome){

        // Retorna uma String como resposta da requisição HTTP.
        // Como estamos utilizando @RestController,
        // o texto é enviado diretamente no corpo da resposta.
        return "Olá " + nome + "!";
    }
}