package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import com.gerenciadordecontas.contasapagar.repository.IContasAReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContasAReceberServices {
    @Autowired
    private IContasAReceberRepository contasAReceberRepository;

    public List<ContasAReceberModel> buscartodas() {
        return contasAReceberRepository.findAll();
    }

    public Optional<ContasAReceberModel> buscarID(Long id) {
        return contasAReceberRepository.findById(id);
    }

    public ContasAReceberModel cadastrarConta(ContasAReceberModel contasAReceberModel) {
        contasAReceberModel.getContaAReceberID();
        contasAReceberModel.getDataRecebimento();
        contasAReceberModel.getDataVencimento();
        contasAReceberModel.getRecebimento();
        contasAReceberModel.getValorRecebido();
        contasAReceberModel.getTipoRecebimento();

        return contasAReceberRepository.save(contasAReceberModel);
    }

    public ContasAReceberModel alterarConta(ContasAReceberModel contasAReceberModel) {
        contasAReceberModel.getStatus();
        contasAReceberModel.getDataRecebimento();
        contasAReceberModel.getValorRecebido();
        contasAReceberModel.getDataVencimento();
        contasAReceberModel.getTipoRecebimento();
        contasAReceberModel.getRecebimento();

        return contasAReceberRepository.save(contasAReceberModel);
    }

    public void deletarconta(Long id) {
        contasAReceberRepository.deleteById(id);
    }
}
