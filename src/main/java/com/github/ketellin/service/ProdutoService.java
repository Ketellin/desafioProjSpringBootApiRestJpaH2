package com.github.ketellin.service;

import com.github.ketellin.domain.dto.ProdutoResponse;

import java.util.List;

public interface ProdutoService {
     List<ProdutoResponse> findAll();
}
