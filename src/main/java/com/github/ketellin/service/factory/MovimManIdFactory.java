package com.github.ketellin.service.factory;

import com.github.ketellin.domain.entity.MovimManId;
import com.github.ketellin.domain.model.MovimentoManualModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovimManIdFactory {

    private final ProdutoCosifFactory produtoCosifFactory;

    public MovimManId createFrom (MovimentoManualModel movimentoManualModel){
        return MovimManId.builder()
                .datMes(movimentoManualModel.getDatMes())
                .datAno(movimentoManualModel.getDatAno())
                .numLancamento(movimentoManualModel.getNumLancamento())
                .produtoCosif(produtoCosifFactory.createFrom(movimentoManualModel.getProdutoCosifModel()))
                .build();
    }
}
