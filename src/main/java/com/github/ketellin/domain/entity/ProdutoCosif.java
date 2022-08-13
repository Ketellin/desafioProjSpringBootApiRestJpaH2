package com.github.ketellin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdutoCosif {

    @EmbeddedId
    private ProdCosifId prodCosifId;
    @Column(name = "COD_CLASSIFICACAO", length = 6)
    private String codClassificacao;
    @Column(name = "STA_STATUS", length = 1)
    private String staStatus;

}


