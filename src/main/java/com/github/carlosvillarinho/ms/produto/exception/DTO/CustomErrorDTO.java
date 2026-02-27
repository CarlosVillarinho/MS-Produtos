package com.github.carlosvillarinho.ms.produto.exception.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CustomErrorDTO {

    //ATRIBUTOS
    private Instant timestamp;
    private Integer status;
    private String error, path;
}
