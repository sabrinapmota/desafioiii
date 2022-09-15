package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import com.gerenciadordecontas.contasapagar.services.ContasAReceberServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContasAReceberController {
    @Autowired
    private ContasAReceberServices contasAReceberServices;

    @GetMapping(path = "/TB_CONTAS_A_RECEBER")
    public List<ContasAReceberModel> buscatodas() {
        return contasAReceberServices.buscartodas();
    }

    @GetMapping(path = "/TB_CONTAS_A_RECEBER/{id}")

    public Optional<ContasAReceberModel> buscaID(@PathVariable long id) {
        return contasAReceberServices.buscarID(id);
    }


    @PostMapping(path = "/TB_CONTAS_A_RECEBER")
    public ContasAReceberModel cadastrarConta(@RequestBody ContasAReceberModel contasAReceberModel) {
        return contasAReceberServices.cadastrarConta(contasAReceberModel);
    }

    @PutMapping(path = "/TB_CONTAS_A_RECEBER/{id}")

    public ContasAReceberModel alteraConta(@RequestBody ContasAReceberModel contasAReceberModel, @PathVariable Long id) {
        return contasAReceberServices.alterarConta(contasAReceberModel);
    }

    @DeleteMapping(path = "/TB_CONTAS_A_RECEBER/{id}")
    public void deletaconta(@PathVariable Long id) {
        contasAReceberServices.deletarconta(id);

    }
}