package com.github.ketellin.rest.adapter;

import com.github.ketellin.domain.dto.MovimentoManualRequest;
import com.github.ketellin.domain.entity.MovimentoManual;
import com.github.ketellin.domain.dto.MovimentoManualResponse;
import com.github.ketellin.domain.model.MovimentoManualModel;
import com.github.ketellin.domain.model.ProdutoCosifModel;
import com.github.ketellin.domain.model.ProdutoModel;
import com.github.ketellin.domain.repository.MovimentoManualDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class MovimentoManualAdapter {
    @Autowired
    MovimentoManualDao movimentoManualDao;

    public MovimentoManualResponse mapTo(MovimentoManual movManualEntity){
        return MovimentoManualResponse.builder()
                .datMes(movManualEntity.getMovimManId().getDatMes())
                .datAno(movManualEntity.getMovimManId().getDatAno())
                .codProduto(movManualEntity.getMovimManId().getProdutoCosif().getProdCosifId().getProduto().getCodProduto())
                .desProduto(movManualEntity.getMovimManId().getProdutoCosif().getProdCosifId().getProduto().getDesProduto())
                .numLancamento(movManualEntity.getMovimManId().getNumLancamento())
                .desDescricao(movManualEntity.getDesDescricao())
                .valValor(movManualEntity.getValValor())
                .build();
    }

    public MovimentoManualModel mapTo(MovimentoManualRequest movimentoManualRequest){

        ProdutoModel produtoModel = new ProdutoModel();
        produtoModel.setCodProduto(movimentoManualRequest.getCodProduto());

        ProdutoCosifModel produtoCosifModel = new ProdutoCosifModel();
        produtoCosifModel.setProdutoModel(produtoModel);
        produtoCosifModel.setCodCosif(movimentoManualRequest.getCodCosif());

        return MovimentoManualModel.builder()
                .datMovimento(LocalDateTime.now())  //Default data/hora atual
                .codUsuario("TESTE")                //valor default
                .datAno(movimentoManualRequest.getDatAno())
                .datMes(movimentoManualRequest.getDatMes())
                .desDescricao(movimentoManualRequest.getDesDescricao())
                .valValor(movimentoManualRequest.getValValor())
                .produtoCosifModel(produtoCosifModel)
                .numLancamento(produceNumLancamento(movimentoManualRequest.getDatAno(), movimentoManualRequest.getDatMes()))
                .build();
    }

    private Integer produceNumLancamento(Integer ano, Integer mes) {
        Integer numLancamentoMax = movimentoManualDao.getMaxNumLancamento(ano, mes);
        if(numLancamentoMax == null)
            numLancamentoMax = 0;

        return numLancamentoMax + 1;
    }
}
