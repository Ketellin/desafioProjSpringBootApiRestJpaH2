package com.github.ketellin.service;

import com.github.ketellin.domain.dto.MovimentoManualRequest;
import com.github.ketellin.domain.entity.MovimentoManual;
import com.github.ketellin.domain.model.MovimentoManualModel;
import com.github.ketellin.domain.repository.MovimentoManualDao;
import com.github.ketellin.rest.adapter.MovimentoManualAdapter;
import com.github.ketellin.domain.dto.MovimentoManualResponse;
import com.github.ketellin.service.factory.MovimentoManualFactory;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MovimentoManualServiceImpl implements MovimentoManualService{

    @Autowired
    MovimentoManualDao movimentoManualDao;

    @Autowired
    private MovimentoManualFactory movimentoManualFactory;

    private final MovimentoManualAdapter movimentoManualAdapter;

    @Override
    public List<MovimentoManualResponse> findAll() {
        return movimentoManualDao.findAll()
                .stream()
                .map(movimentoManualAdapter::mapTo)
                .collect(Collectors.toList());
    }

    @Override
    public MovimentoManualResponse salvarMovimento(MovimentoManualRequest movimentoManualRequest) {

        MovimentoManualModel movManModel = movimentoManualAdapter.mapTo(movimentoManualRequest);
        MovimentoManual movimentoManual  = movimentoManualFactory.createFrom(movManModel);
        MovimentoManual movimentoNovo    = movimentoManualDao.save(movimentoManual);

        return movimentoManualAdapter.mapTo(movimentoNovo);
    }


}

