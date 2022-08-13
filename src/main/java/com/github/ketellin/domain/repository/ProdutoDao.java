package com.github.ketellin.domain.repository;

import com.github.ketellin.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoDao extends JpaRepository<Produto,String> {

}
