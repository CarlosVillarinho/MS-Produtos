package com.github.carlosvillarinho.ms.produto.dto;

import com.github.carlosvillarinho.ms.produto.entities.Produto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

//LOMBOK
@AllArgsConstructor //CRIA CONSTRUTOR COM TODOS OS ARGUMENTOS
@NoArgsConstructor //CRIA CONSTRUTOR SEM NENHUM ARGUMENTO
@Getter
public class ProdutoDTO {

    //ATRIBUTOS
    private Long id;

    @NotBlank(message = "Campo nome é requerido")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;

    @NotBlank(message = "Campo descrição é requerido")
    @Size(min = 10, message = "A descrição deve ter no mínimo 10 caracteres")
    private String descricao;

    @NotNull(message = "O campo valor é requerido")
    @Positive(message = "O campo valor deve ser um número positivo maior que zero")
    private Double valor;

    @NotNull(message = "Campo categoria é requerido")
    private CategoriaDTO categoria;

    public ProdutoDTO(Produto produto) {
        id = produto.getId();
        nome = produto.getNome();
        descricao = produto.getDescricao();
        valor = produto.getValor();
        categoria = new CategoriaDTO(produto.getCategoria());
    }
}
