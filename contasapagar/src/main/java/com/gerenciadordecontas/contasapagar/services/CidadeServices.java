package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.CidadeModel;
import com.gerenciadordecontas.contasapagar.repository.IcidadeRpository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeServices {
    @Autowired
    private IcidadeRpository icidadeRpository;

    public List<CidadeModel> buscartodas() {
        return icidadeRpository.findAll();
    }

    public Optional buscarId(Long id) {
        return icidadeRpository.findById(id);
    }

    public CidadeModel cadastrarCidade(CidadeModel cidadeModel) {
        cidadeModel.getIdCidade();
        cidadeModel.getNomeCidade();

        return icidadeRpository.save(cidadeModel);
    }

    public CidadeModel alterarCidade(CidadeModel cidadeModel) {
        cidadeModel.getNomeCidade();

        return icidadeRpository.save();
    }

    public void deletarCidade(Long id) {
        icidadeRpository.deleteById(id);
    }
}
