package com.github.ketellin.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProdutoCosifModel {

    private ProdutoModel produtoModel;

    private String codCosif;

    private String codClassificacao;

    private String staStatus;

}


