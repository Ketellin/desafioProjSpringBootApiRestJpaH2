package com.github.ketellin.domain.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
@JsonPropertyOrder({"datAno","datMes"})
public class MovimentoManualResponse implements Serializable {

    private Integer datMes;
    private Integer datAno;
    private String codProduto;
    private String desProduto;
    private Integer numLancamento;
    private String desDescricao;
    private BigDecimal valValor;

}
