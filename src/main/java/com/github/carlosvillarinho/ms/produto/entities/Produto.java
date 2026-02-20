package com.github.carlosvillarinho.ms.produto.entities;

import jakarta.persistence.*;
import lombok.*;

//LOMBOK
@AllArgsConstructor //CRIA CONSTRUTOR COM TODOS OS ARGUMENTOS
@NoArgsConstructor //CRIA CONSTRUTOR SEM NENHUM ARGUMENTO
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity //DECLARO COMO ENTIDADE
@Table(name = "tb_produto") //REVERENCIO A TABELA NO SQL, BASIAMEBTE DIGO QUEESSA ENTIDADE É A TABELA
public class Produto {

    @Id //DECLARO A PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ATRIBUTOS
    private Long id;
    private String nome, descricao;
    private Double valor;
}