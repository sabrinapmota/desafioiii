package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.CidadeModel;
import com.gerenciadordecontas.contasapagar.services.CidadeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CidadeController {
    @Autowired
    private CidadeServices cidadeServices;

    @GetMapping(path = "/CIDADE_TB")

    public List<CidadeModel>
    buscarCidade() {
        return cidadeServices.buscartodas();
    }

    @GetMapping(path = "/CIDADE_TB/{id}")

    public Optional<CidadeModel> buscarId(@PathVariable long id) {
        return cidadeServices.buscarId(id);
    }

    @PostMapping(path = "/CIDADE_TB")
    public CidadeModel cadastrarCidade(@RequestBody CidadeModel cidadeModel) {

        return cidadeServices.cadastrarCidade(cidadeModel);
    }

    @PutMapping(path = "/CIDADE_TB")
    public CidadeModel alterarCidade(@RequestBody CidadeModel cidadeModel, @PathVariable Long id) {
        return cidadeServices.alterarCidade(cidadeModel);
    }

    @DeleteMapping(path = "/CIDADE_TB/{id}")

    public void deletarCidade(@PathVariable long id) {
        cidadeServices.deletarCidade(id);
    }
}
