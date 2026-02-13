package com.github.carlosvillarinho.ms.produto.dto;

import java.util.List;

public class ProdutoResponseDTO {

    //ATRIBUTOS
    private Long id;
    private String nome, decricao;
    private Double valor;

    //CONSTRUTORES
    public ProdutoResponseDTO() {
    }

    public ProdutoResponseDTO(Long id, String nome, String decricao, Double valor) {
        this.id = id;
        this.nome = nome;
        this.decricao = decricao;
        this.valor = valor;
    }

    public static List<ProdutoResponseDTO> create(){
        return List.of(
                new ProdutoResponseDTO(1L, "Smart TV", "Smart TV LG LED 50 polegadas", 2285.0),
                new ProdutoResponseDTO(2L, "Mouse Microsoft", "Mouse sem fio", 250.0),
                new ProdutoResponseDTO(3L, "Telado Microsoft", "Teclado se fio", 278.95)
        );
    }

    //GETS AND SETS
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return decricao;
    }
    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
