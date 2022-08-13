package com.github.ketellin.service.factory;

import com.github.ketellin.domain.entity.ProdutoCosif;
import com.github.ketellin.domain.model.ProdutoCosifModel;
import com.github.ketellin.domain.repository.ProdutoCosifDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProdutoCosifFactory {

    @Autowired
    private ProdutoCosifDao produtoCosifDao;

    public ProdutoCosif createFrom (ProdutoCosifModel produtoCosifModel){
        try {
            ProdutoCosif produtoCosifEntity = produtoCosifDao.
                    findProdutoCosifByProdCosifId_CodCosifAndProdCosifId_Produto_CodProduto(
                            produtoCosifModel.getCodCosif(),
                            produtoCosifModel.getProdutoModel().getCodProduto());
            return ProdutoCosif.builder()
                    .staStatus(produtoCosifEntity.getStaStatus())
                    .codClassificacao(produtoCosifEntity.getCodClassificacao())
                    .prodCosifId(produtoCosifEntity.getProdCosifId())
                    .build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }



    }
}
