package com.github.ketellin.rest.adapter;

import com.github.ketellin.domain.entity.ProdutoCosif;
import com.github.ketellin.domain.dto.ProdutoCosifResponse;
import org.springframework.stereotype.Component;

@Component
public class ProdutoCosifAdapter {
    public ProdutoCosifResponse mapTo (ProdutoCosif prodCosifEntity){
        return ProdutoCosifResponse.builder()
                .codCosif(prodCosifEntity.getProdCosifId().getCodCosif())
                .codClassificacao((prodCosifEntity.getCodClassificacao()))
                .build();
    }

}
