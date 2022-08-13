package com.github.ketellin.service;

import com.github.ketellin.domain.repository.ProdutoCosifDao;
import com.github.ketellin.rest.adapter.ProdutoCosifAdapter;
import com.github.ketellin.domain.dto.ProdutoCosifResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProdutoCosifServiceImpl implements ProdutoCosifService{

    @Autowired
    ProdutoCosifDao produtoCosifDao;

    private final ProdutoCosifAdapter prodCosifAdapter;

    @Override
    public List<ProdutoCosifResponse> findProdutoCosifByProdCosifIdI(String codProduto) {
        //return produtoCosifDao.findProdutoCosifByProdCosifIdI(codProduto)
        return produtoCosifDao.findProdutoCosifByProdCosifId_Produto_CodProduto(codProduto)
                .stream()
                .map(prodCosifAdapter::mapTo)
                .collect(Collectors.toList());
    }

}
