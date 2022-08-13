package com.github.ketellin.rest.controller;

import com.github.ketellin.domain.dto.ProdutoCosifResponse;
import com.github.ketellin.service.ProdutoCosifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cosifs")
public class ProdutoCosifController {

    @Autowired
    ProdutoCosifService produtoCosifService;

    @GetMapping("/{codProduto}")
    /*@ApiResponses({
            @ApiResponse(code = 200, message = "Consulta executada com sucesso!"),
            @ApiResponse(code = 204, message = "Não existem dados que satisfaçam o filtro utilizado")
    })*/
    public List<ProdutoCosifResponse> getCosifsByCodProduto(@PathVariable String codProduto){
        return produtoCosifService.findProdutoCosifByProdCosifIdI(codProduto);
        //return produtoCosifService.;
    }

}
