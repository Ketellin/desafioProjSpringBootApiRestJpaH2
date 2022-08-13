package com.github.ketellin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProdCosifId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "COD_PRODUTO")
    private Produto produto;
    @Column(name = "COD_COSIF", length = 11)
    private String codCosif;
}
