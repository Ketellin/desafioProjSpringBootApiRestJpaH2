package com.github.ketellin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MovimentoManual {
    @EmbeddedId
    private MovimManId movimManId;
    @Column(name = "DES_DESCRICAO")
    private String desDescricao;
    @Column(name = "DAT_MOVIMENTO")
    private LocalDateTime datMovimento;
    @Column(name = "COD_USUARIO")
    private String codUsuario;
    @Column(name = "VAL_VALOR")
    private BigDecimal valValor;



}
