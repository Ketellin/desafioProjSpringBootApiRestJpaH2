package com.github.ketellin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import javax.validation.constraints.NotEmpty;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MovimManId implements Serializable {
    @Column(name = "DAT_MES")
    @NotEmpty(message = "O mês é obrigatório!")
    private Integer datMes;
    @Column(name = "DAT_ANO")
    @NotEmpty(message = "O ano é obrigatório!")
    private Integer datAno;
    @Column(name = "NUM_LANCAMENTO")
    private Integer numLancamento;
    @ManyToOne
    @JoinColumns({
                    @JoinColumn (name = "COD_COSIF"),
                    @JoinColumn (name = "COD_PRODUTO")
                })
    private ProdutoCosif produtoCosif;
}
