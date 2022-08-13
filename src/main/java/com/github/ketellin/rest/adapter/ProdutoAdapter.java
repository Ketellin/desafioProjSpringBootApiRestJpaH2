package com.github.ketellin.rest.adapter;

import com.github.ketellin.domain.entity.Produto;
import com.github.ketellin.domain.dto.ProdutoResponse;
import org.springframework.stereotype.Component;

@Component
public class ProdutoAdapter {
    public ProdutoResponse mapTo (Produto produtoEntity){
        return ProdutoResponse.builder()
                .codProduto(produtoEntity.getCodProduto())
                .desProduto((produtoEntity.getDesProduto()))
                .build();
    }
}
