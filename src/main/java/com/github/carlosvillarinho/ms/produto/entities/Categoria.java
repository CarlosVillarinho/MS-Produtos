package com.github.carlosvillarinho.ms.produto.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor //CRIA CONSTRUTOR COM TODOS OS ARGUMENTOS
@NoArgsConstructor //CRIA CONSTRUTOR SEM NENHUM ARGUMENTO
@Getter //CRIA GETTER DE TODOS ATRIBUTOS
@Setter //CRIA SETTER DE TODOS ATRIBUTOS
@EqualsAndHashCode(of = "id")
@Entity //DECLARO COMO ENTIDADE
@Table(name = "tb_categoria") //REVERENCIO A TABELA NO SQL, BASICAMENTE DIGO QUEESSA ENTIDADE É A TABELA
public class Categoria {

    @Id //DECLARO A PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //ATRIBUTOS
    private Long id;
    private String nome;

    //RELACIONAMENTO - Categoria com Produto
    @OneToMany(mappedBy = "categoria") //UM PARA MUITOS
    private List<Produto> produtos = new ArrayList<>();
}
