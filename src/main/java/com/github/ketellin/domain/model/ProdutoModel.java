package com.github.ketellin.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoModel {

    private String codProduto;

    private String desProduto;

    private String staStatus;
}
