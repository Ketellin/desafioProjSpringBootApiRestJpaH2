package com.github.ketellin.service.factory;

import com.github.ketellin.domain.entity.MovimentoManual;
import com.github.ketellin.domain.model.MovimentoManualModel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovimentoManualFactory {

    private final MovimManIdFactory movimManIdFactory;

    public MovimentoManual createFrom (MovimentoManualModel movimentoManualModel){

        return MovimentoManual.builder()
                .movimManId(movimManIdFactory.createFrom(movimentoManualModel))
                .codUsuario(movimentoManualModel.getCodUsuario())
                .datMovimento(movimentoManualModel.getDatMovimento())
                .desDescricao(movimentoManualModel.getDesDescricao())
                .valValor(movimentoManualModel.getValValor())
                .build();
    }
}
