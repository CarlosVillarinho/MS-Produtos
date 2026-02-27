package com.github.carlosvillarinho.ms.produto.exception.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class FieldMessageDTO {

    //ATRIBUTOS
    private String fieldName, Message;
}
