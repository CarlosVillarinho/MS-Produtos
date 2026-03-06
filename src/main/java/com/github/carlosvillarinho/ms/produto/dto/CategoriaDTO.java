package com.github.carlosvillarinho.ms.produto.dto;

import com.github.carlosvillarinho.ms.produto.entities.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor //CRIA CONSTRUTOR COM TODOS OS ARGUMENTOS
@NoArgsConstructor //CRIA CONSTRUTOR SEM NENHUM ARGUMENTO
@Getter //CRIA GETTER DE TODOS ATRIBUTOS
public class CategoriaDTO {
    //ATRIBUTOS
    private Long id;

    @NotBlank(message = "Campo nome não pode ser vazio, nulo ou em branco")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    private String nome;

    public CategoriaDTO(Categoria categoria) {
        id = categoria.getId();
        nome = categoria.getNome();
    }
}
