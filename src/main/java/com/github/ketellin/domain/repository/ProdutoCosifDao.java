package com.github.ketellin.domain.repository;

import com.github.ketellin.domain.entity.ProdutoCosif;
import com.github.ketellin.domain.entity.ProdCosifId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoCosifDao extends JpaRepository<ProdutoCosif, ProdCosifId> {

    List<ProdutoCosif> findProdutoCosifByProdCosifId_Produto_CodProduto(@Param("codProduto") String codProduto);

    ProdutoCosif findProdutoCosifByProdCosifId_CodCosifAndProdCosifId_Produto_CodProduto(
            @Param("codCosif") String codCosif,
            @Param("codProduto") String codProduto);
}
