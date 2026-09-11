package com.senai.aula06.controller;

import com.senai.aula06.Aula06Application;
// Importa a anotação responsável por criar uma rota HTTP do tipo GET
import org.springframework.web.bind.annotation.GetMapping;

// Importa a anotação que indica que esta classe será um Controller REST
import org.springframework.web.bind.annotation.RestController;

// Indica ao Spring Boot que esta classe é um Controller REST.
// Os métodos desta classe podem responder às requisições HTTP da API.
@RestController
public class HelloController {
    
    private final Aula06Application aula06Application;

    HelloController(Aula06Application aula06Application) {
        this.aula06Application = aula06Application;
    }

    // Cria um endpoint HTTP do tipo GET.
    // Quando o usuário acessar:
    // http://localhost:8080/hello
    // o Spring executará o método hello(). 
    @GetMapping("/hello")
    public String hello(){

        // Retorna uma String como resposta da requisição HTTP.
        // Como estamos utilizando @RestController,
        // o texto é enviado diretamente no corpo da resposta.
        return "Olá Spring Boot!";
    }
}
