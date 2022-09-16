package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.EstadoModel;
import com.gerenciadordecontas.contasapagar.repository.IEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.desktop.OpenFilesEvent;
import java.util.List;
import java.util.Optional;

@Service

public class EstadoServices {
    @Autowired
    private IEstadoRepository estadoRepository;

    public List<EstadoModel> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Optional <EstadoModel> buscarID(Long id) {
        return estadoRepository.findById(id);
    }

    public EstadoModel cadastrarEstado(EstadoModel estadoModel) {

        estadoModel.getId();
        estadoModel.getUf();
        estadoModel.getNomeDestado();
        return estadoRepository.save(estadoModel);
    }

    public EstadoModel alterarEstado(EstadoModel estadoModel) {
        estadoModel.getUf();
        estadoModel.getNomeDestado();

        return estadoRepository.save(estadoModel);
    }

    public void deletarEstado(Long id) {
        estadoRepository.deleteById(id);
    }
}
