package com.github.carlosvillarinho.ms.produto.exception.DTO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorDTO extends CustomErrorDTO {

    private List<FieldMessageDTO> errors = new ArrayList<>();

    //CONSTRUTOR
    public ValidationErrorDTO(Instant timestamp, Integer status,
                              String error, String path) {

        super(timestamp, status, error, path);
    }

    //METODOS
    //adiciona erros a List
    public void addError(String fieldName, String message){
        //remove error de campo duplicado
        errors.removeIf(x -> x.getFieldName().equals(fieldName));
        errors.add(new FieldMessageDTO(fieldName, message));
    }

}
