package com.senai.aula06.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.aula06.model.Produto;

@RestController
public class ProdutoController {

    @GetMapping("/produto")
    public Produto produto() {
        Produto produto = new Produto(1, "Notebook", 3500.00);

        return produto;
    }
}
