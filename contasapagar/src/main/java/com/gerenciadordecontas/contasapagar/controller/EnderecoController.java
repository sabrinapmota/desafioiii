package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.EnderecoModel;
import com.gerenciadordecontas.contasapagar.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EnderecoController {
    @Autowired
    private EnderecoServices enderecoServices;

    public List<EnderecoModel> buscarEndereco() {
        return
                enderecoServices.buscarTodos();
    }

    @GetMapping(path = "/ENDERECO_TB")

    public List<EnderecoModel> buscarAllEnd() {
        return enderecoServices.buscarTodos();
    }

    @GetMapping(path = "/ENDERECO_TB/{id}")

    public Optional<EnderecoModel> buscarID(@PathVariable long id) {
        enderecoServices.buscarId(id);
    }

    @PostMapping(path = "/ENDERECO_TB")
    public EnderecoModel cadastrarEndereco(@RequestBody EnderecoModel enderecoModel) {
        return enderecoServices.cadastrarEndereco(enderecoModel);
    }

    @PutMapping(path = "/ENDERECO_TB/{id}")
    public EnderecoModel alterarEndereco(@RequestBody EnderecoModel enderecoModel, @PathVariable long id) {
        return enderecoServices.alterarEndereco(enderecoModel);
    }

    @DeleteMapping(path = "/ENDERECO_TB/{id}")
    public void deletarEndereco(@PathVariable long id) {
        enderecoServices.deletarendereco(id);
    }
}
