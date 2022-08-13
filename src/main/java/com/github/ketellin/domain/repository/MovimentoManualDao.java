package com.github.ketellin.domain.repository;

import com.github.ketellin.domain.entity.MovimManId;
import com.github.ketellin.domain.entity.MovimentoManual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MovimentoManualDao extends JpaRepository<MovimentoManual, MovimManId> {

    @Query(value = " SELECT MAX(NUM_LANCAMENTO) AS MaiorValor FROM MOVIMENTO_MANUAL  " +
            "WHERE DAT_ANO = :ano AND DAT_MES = :mes ", nativeQuery = true)
    Integer getMaxNumLancamento(@Param("ano") Integer ano, @Param("mes") Integer mes);


}
