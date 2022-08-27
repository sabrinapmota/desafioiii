package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.ContasaPagarModel;
import com.gerenciadordecontas.contasapagar.repository.ContasaPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ContasaPagarServices {
    @Autowired
    private ContasaPagarRepository contasaPagarRepository;

    public List<ContasaPagarModel> buscarContas() {
        return contasaPagarRepository.findAll();
    }

    public Optional<ContasaPagarModel> buscarId(Long id) {
        return contasaPagarRepository.findById(id);
    }

    public ContasaPagarModel cadastrarconta(ContasaPagarModel contasaPagarModel) {
        contasaPagarModel.getId();
        contasaPagarModel.getDataVencimento();
        contasaPagarModel.getNome();
        contasaPagarModel.getTipo();
        contasaPagarModel.getValor();
        return contasaPagarRepository.save(contasaPagarModel);
    }

    public ContasaPagarModel  alterarContas(ContasaPagarModel contasaPagarModel) {
        contasaPagarModel.getDataPagamento();
        contasaPagarModel.getValor();
        contasaPagarModel.getTipo();
                contasaPagarModel.getStatus();
                return contasaPagarRepository.save(contasaPagarModel);
    }
    public void deletarcontas(Long id) {
        contasaPagarRepository.deleteById(id);
    }
}
