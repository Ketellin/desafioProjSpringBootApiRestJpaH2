package com.github.ketellin.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Validated
@Builder
public class MovimentoManualModel implements Serializable {

    @NotBlank(message = "O mês é obrigatório!")
    private Integer datMes;

    @NotBlank(message = "O ano é obrigatório!")
    private Integer datAno;

    private Integer numLancamento;

    private ProdutoCosifModel produtoCosifModel;

    @NotBlank(message = "A descrição é obrigatória!")
    private String desDescricao;

    private LocalDateTime datMovimento;

    private String codUsuario;

    @NotBlank(message = "O valor é obrigatório!")
    private BigDecimal valValor;

}
