package com.github.ketellin.service;

import com.github.ketellin.domain.repository.ProdutoDao;
import com.github.ketellin.rest.adapter.ProdutoAdapter;
import com.github.ketellin.domain.dto.ProdutoResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    public ProdutoDao produtoDao;

    private final ProdutoAdapter prodAdapter;

    @Override
    public List<ProdutoResponse> findAll() {
        return produtoDao.findAll()
                .stream()
                .map(prodAdapter::mapTo)
                .collect(Collectors.toList());
    }
}
