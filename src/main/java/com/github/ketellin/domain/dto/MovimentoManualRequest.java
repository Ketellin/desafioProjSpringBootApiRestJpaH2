package com.github.ketellin.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovimentoManualRequest implements Serializable {

    private Integer datMes;
    private Integer datAno;
    private String codProduto;
    private String codCosif;
    private String desDescricao;
    private BigDecimal valValor;
}
