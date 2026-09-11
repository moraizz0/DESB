package com.senai.aula06.model;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    public Produto (int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto(int id2, Object nome2, double preco2) {
        //TODO Auto-generated constructor stub
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

}
