package com.gerenciadordecontas.contasapagar.controller;

import com.gerenciadordecontas.contasapagar.model.EstadoModel;
import com.gerenciadordecontas.contasapagar.repository.IEstadoRepository;
import com.gerenciadordecontas.contasapagar.services.EstadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstadoController {
    @Autowired
    private EstadoServices estadoServices;

    @GetMapping(path = "/ESTADO_TB")

    public List<EstadoModel> buscarAll() {
        return estadoServices.buscarTodos();
    }

    @GetMapping(path = "/ESTADO_TB/{id}")
    public Optional<EstadoModel> buscaID(@PathVariable long id) {
        return estadoServices.buscarID(id);
    }

    @PostMapping(path = "/ESTADO_TB")

    public EstadoModel cadastrarEstado(@RequestBody EstadoModel estadoModel) {
        return estadoServices.cadastrarEstado(estadoModel);
    }

    @PutMapping(path = "/ESTADO_TB/{id}")

public EstadoModel    alteraEstado(@RequestBody EstadoModel estadoModel, @PathVariable Long id) {
        return estadoServices.alterarEstado(estadoModel);
    }

    @DeleteMapping(path = "ESTADO_TB/{id}")

    public void deletaEstado(@PathVariable long id) {
        estadoServices.deletarEstado(id);
    }

}