package com.github.ketellin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Produto {
    @Id
    @Column(name = "COD_PRODUTO", length = 4)
    private String codProduto;
    @Column(name = "DES_PRODUTO", length = 30)
    private String desProduto;
    @Column(name = "STA_STATUS", length = 1)
    private String staStatus;
}
