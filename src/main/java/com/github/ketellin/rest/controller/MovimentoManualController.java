package com.github.ketellin.rest.controller;

import com.github.ketellin.domain.dto.MovimentoManualRequest;
import com.github.ketellin.domain.dto.MovimentoManualResponse;
import com.github.ketellin.service.MovimentoManualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/movimentos")
public class MovimentoManualController{

    @Autowired
    private MovimentoManualService movimentoManualService;

    @GetMapping
    public List<MovimentoManualResponse> getAllMovimentos(){

        return movimentoManualService.findAll();

    }

    @PostMapping
    public ResponseEntity<MovimentoManualResponse> saveMovimentos (@RequestBody @Valid MovimentoManualRequest movimentoManualRequest){
        //usar RepresentationModelAssembler

        MovimentoManualResponse response = movimentoManualService.salvarMovimento(movimentoManualRequest);

        return ResponseEntity.ok(response);
    }
}
