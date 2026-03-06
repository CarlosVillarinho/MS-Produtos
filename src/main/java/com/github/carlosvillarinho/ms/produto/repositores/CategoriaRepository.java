package com.github.carlosvillarinho.ms.produto.repositores;

import com.github.carlosvillarinho.ms.produto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
