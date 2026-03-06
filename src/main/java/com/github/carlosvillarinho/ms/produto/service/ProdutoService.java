package com.github.carlosvillarinho.ms.produto.service;

import com.github.carlosvillarinho.ms.produto.dto.ProdutoDTO;
import com.github.carlosvillarinho.ms.produto.entities.Categoria;
import com.github.carlosvillarinho.ms.produto.entities.Produto;
import com.github.carlosvillarinho.ms.produto.exception.DatabaseException;
import com.github.carlosvillarinho.ms.produto.exception.ResourceNotFoundException;
import com.github.carlosvillarinho.ms.produto.repositores.CategoriaRepository;
import com.github.carlosvillarinho.ms.produto.repositores.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    //METODOS
    @Transactional(readOnly = true)
    public List<ProdutoDTO> findAllProdutos(){
        List<Produto> produtos = produtoRepository.findAll();

        return produtos.stream().map(ProdutoDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public ProdutoDTO findProdutoById(Long id){
        Produto produto = produtoRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado. ID: " + id) //TRATANDO EXCESSAO
        );

        return new ProdutoDTO(produto);
    }

    @Transactional
    public ProdutoDTO saveProduto(ProdutoDTO produtoDTO){
        try{
            Produto produto = new Produto();
            copyDtoToProduto(produtoDTO, produto);
            produto = produtoRepository.save(produto);
            return new ProdutoDTO(produto);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Não foi possivel salvar Produto. Categoria inexistente " +
                    " (ID: " + produtoDTO.getCategoria().getId() + ")");
        }

    }

    private void copyDtoToProduto(ProdutoDTO produtoDTO, Produto produto){
        produto.setNome(produtoDTO.getNome());
        produto.setDescricao(produtoDTO.getDescricao());
        produto.setValor(produtoDTO.getValor());
        //OBJETO COMPLETO GERENCIADO
        Categoria categoria = categoriaRepository.getReferenceById(produtoDTO.getCategoria().getId());
        produto.setCategoria(categoria);
    }

    @Transactional
    public ProdutoDTO updateProduto(Long id, ProdutoDTO produtoDTO){
        try{
            Produto produto = produtoRepository.getReferenceById(id);
            copyDtoToProduto(produtoDTO, produto);
            produto = produtoRepository.save(produto);
            return new ProdutoDTO(produto);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException("Recurso não encontrado. ID: " + id);
        }
    }

    @Transactional
    public void deleteProdutoById(Long id){
        if (!produtoRepository.existsById(id)){
            throw new ResourceNotFoundException("Revurso não encontrado. ID: " + id);
        }

        produtoRepository.deleteById(id);
    }
}
