package com.github.ketellin.rest;

import lombok.Getter;

import java.util.List;

/**
 * Classe com a responsabilidade de padronizar um ou vários erros em um array
 */

public class ApiErrors {
    @Getter
    private List<String> errors;

/*    public ApiErrors(String mensagemErro){
        this.errors = Arrays.asList((mensagemErro));
    }*/

    public ApiErrors(List<String> errors){
        this.errors = errors;
    }
}

