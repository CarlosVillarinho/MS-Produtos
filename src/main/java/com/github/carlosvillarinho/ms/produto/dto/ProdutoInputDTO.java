package com.github.carlosvillarinho.ms.produto.dto;

public class ProdutoInputDTO {

    //ATRIBUTOS
    private String nome, descricao;
    private double valor;

    //CONSTRUTORES
    public ProdutoInputDTO() {
    }

    public ProdutoInputDTO(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    //GETS AND SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}