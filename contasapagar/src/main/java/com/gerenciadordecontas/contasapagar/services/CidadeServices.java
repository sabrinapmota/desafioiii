package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.CidadeModel;
import com.gerenciadordecontas.contasapagar.repository.IcidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeServices {
    @Autowired
    private IcidadeRepository icidadeRepository;

    public List<CidadeModel> buscartodas() {
        return icidadeRepository.findAll();
    }

    public Optional buscarId(Long id) {
        return icidadeRepository.findById(id);
    }

    public CidadeModel cadastrarCidade(CidadeModel cidadeModel) {
        cidadeModel.getCodigo();
        cidadeModel.getNomeCidade();

        return icidadeRepository.save(cidadeModel);
    }

    public CidadeModel alterarCidade(CidadeModel cidadeModel) {
        cidadeModel.getNomeCidade();

        return icidadeRepository.save(cidadeModel);
    }

    public void deletarCidade(Long id) {
        icidadeRepository.deleteById(id);
    }
}
