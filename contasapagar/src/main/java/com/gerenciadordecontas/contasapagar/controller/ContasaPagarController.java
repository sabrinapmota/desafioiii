package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.ContasaPagarModel;
import com.gerenciadordecontas.contasapagar.repository.ContasaPagarRepository;
import com.gerenciadordecontas.contasapagar.services.ContasaPagarServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class ContasaPagarController {
    @Autowired
    private ContasaPagarServices contasaPagarServices;

    @Autowired
    private ContasaPagarRepository contasaPagarRepository;

    @GetMapping(path = "/gerenciador")
    public List<ContasaPagarModel> buscaTodasInfo() {
        return contasaPagarServices.buscarContas();
    }

    @GetMapping(path = "/gerenciador/{id}")
    public Optional<ContasaPagarModel> buscarPorId(@PathVariable long id) {
        return contasaPagarServices.buscarId(id);
    }

    @PostMapping(path = "/gerenciador")
    public ContasaPagarModel cadastrarConta(@RequestBody ContasaPagarModel contasaPagarModel) {
        return contasaPagarServices.cadastrarconta(contasaPagarModel);
    }

    @PutMapping(path = "/gerenciador/{id}")
    public ResponseEntity<ContasaPagarModel> alterarConta(@RequestBody ContasaPagarModel contasaPagarModel, @PathVariable Long id) {
        if (!contasaPagarRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(contasaPagarServices.alterarContas(contasaPagarModel));

    }

    @DeleteMapping(path = "/gerenciador/{id}")
    public void deletarConta(@PathVariable long id) {
        contasaPagarServices.deletarcontas(id);
    }
}
