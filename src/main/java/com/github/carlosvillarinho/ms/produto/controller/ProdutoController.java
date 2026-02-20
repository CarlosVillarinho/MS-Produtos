package com.github.carlosvillarinho.ms.produto.controller;

import com.github.carlosvillarinho.ms.produto.dto.ProdutoDTO;
import com.github.carlosvillarinho.ms.produto.dto.ProdutoInputDTO;
import com.github.carlosvillarinho.ms.produto.dto.ProdutoResponseDTO;
import com.github.carlosvillarinho.ms.produto.entities.Produto;
import com.github.carlosvillarinho.ms.produto.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //DEFINO COMO CLASSE DE CONTROLE
@RequestMapping("/produtos") //MAPEIO PARA A REQUISICAO
public class ProdutoController {

//    //CRIANDO PRODUTOS/ELEMENTOS
//    @GetMapping
//    public ResponseEntity<List<ProdutoResponseDTO>> getProduto(){
//
//        List<ProdutoResponseDTO> dto = ProdutoResponseDTO.create();
//
//        return ResponseEntity.ok(dto);
//    }
//
//    //CRIA PRODUTOS COM O POST
//    @PostMapping
//    public ResponseEntity<ProdutoResponseDTO> createProduto(@RequestBody ProdutoInputDTO inputDTO){
//
//        ProdutoResponseDTO dto = new ProdutoResponseDTO(1L, inputDTO.getNome(),
//                inputDTO.getDescricao(), inputDTO.getValor());
//
//        return ResponseEntity.created(null).body(dto);
//    }

    @Autowired
    private ProdutoService produtoService;

    //METODOS
    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAllProdutos(){
        List<ProdutoDTO> list = produtoService.findAllProdutos();

        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> getProdutoById(@PathVariable Long id){
        ProdutoDTO produtoDTO = produtoService.findProdutoById(id);

        return ResponseEntity.ok(produtoDTO);
    }
}