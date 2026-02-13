package com.github.carlosvillarinho.ms.produto.controller;

import com.github.carlosvillarinho.ms.produto.dto.ProdutoInputDTO;
import com.github.carlosvillarinho.ms.produto.dto.ProdutoResponseDTO;
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
}