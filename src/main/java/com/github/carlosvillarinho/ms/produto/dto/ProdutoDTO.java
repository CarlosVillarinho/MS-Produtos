package com.github.carlosvillarinho.ms.produto.dto;

import com.github.carlosvillarinho.ms.produto.entities.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor //CRIA CONSTRUTOR COM TODOS OS ARGUMENTOS
@NoArgsConstructor //CRIA CONSTRUTOR SEM NENHUM ARGUMENTO
@Getter
public class ProdutoDTO {

    //ATRIBUTOS
    private Long id;
    private String nome, descricao;
    private double valor;

    public ProdutoDTO(Produto produto) {
        id = produto.getId();
        nome = produto.getNome();
        descricao = produto.getDescricao();
        valor = produto.getValor();
    }
}
