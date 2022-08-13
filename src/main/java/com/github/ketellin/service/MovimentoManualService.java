package com.github.ketellin.service;

import com.github.ketellin.domain.dto.MovimentoManualRequest;

import com.github.ketellin.domain.dto.MovimentoManualResponse;

import java.util.List;

public interface MovimentoManualService {
     List<MovimentoManualResponse> findAll();

     MovimentoManualResponse salvarMovimento(MovimentoManualRequest movimentoManualRequest);


}
