package com.github.ketellin.service;

import com.github.ketellin.domain.dto.ProdutoCosifResponse;

import java.util.List;

public interface ProdutoCosifService {
    List<ProdutoCosifResponse> findProdutoCosifByProdCosifIdI(String codProduto);

}
