package com.github.carlosvillarinho.ms.produto.repositores;

import com.github.carlosvillarinho.ms.produto.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
