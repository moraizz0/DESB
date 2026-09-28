package com.senai.aula06.controller;

import com.senai.aula06.Aula06Application;
// Importa a anotação responsável por criar uma rota HTTP do tipo GET
import org.springframework.web.bind.annotation.GetMapping;

// Importa a anotação que indica que esta classe será um Controller REST
import org.springframework.web.bind.annotation.RestController;

// Indica ao Spring Boot que esta classe é um Controller REST.
// Os métodos desta classe podem responder às requisições HTTP da API.
@RestController

public class DadosController {
    
    private final Aula06Application aula06Application; 

    public DadosController(Aula06Application aula06Application){
        this.aula06Application = aula06Application;
    }

    @GetMapping("/dados")
    public String dados() {
        return "Senai Roberto Mange - Daniel Morais";
    }
      
}

