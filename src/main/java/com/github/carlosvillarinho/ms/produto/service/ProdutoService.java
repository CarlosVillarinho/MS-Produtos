package com.github.carlosvillarinho.ms.produto.service;

import com.github.carlosvillarinho.ms.produto.dto.ProdutoDTO;
import com.github.carlosvillarinho.ms.produto.entities.Produto;
import com.github.carlosvillarinho.ms.produto.repositores.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    //METODOS
    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAllProdutos(){
        List<Produto> produtos = produtoRepository.findAll();

        return produtos.stream().map(ProdutoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ProdutoDTO findProdutoById(Long id){
        Produto produto = produtoRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Recurso não encontrado. ID: " + id) //TRATANDO EXCESSAO
        );

        return new ProdutoDTO(produto);
    }
}
