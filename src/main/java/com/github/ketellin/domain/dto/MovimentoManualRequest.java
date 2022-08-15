package com.github.ketellin.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovimentoManualRequest implements Serializable {

    @NotNull(message = "O mês deve ser preenchido!")
    private Integer datMes;
    @NotNull(message = "O ano deve ser preenchido!")
    private Integer datAno;
    @NotNull(message = "O produto deve ser selecionado!")
    private String codProduto;
    @NotNull(message = "O COSIF deve ser selecionado!")
    private String codCosif;
    @NotNull(message = "A descrição deve ser preenchida!")
    private String desDescricao;
    @NotNull(message = "O valor deve ser preenchido!")
    private BigDecimal valValor;
}
