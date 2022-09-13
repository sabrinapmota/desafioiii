package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.EnderecoModel;
import com.gerenciadordecontas.contasapagar.repository.IEnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServices {
    @Autowired
    private IEnderecoRepository enderecoRepository;
    public List<EnderecoModel> buscarTodos() {
        return enderecoRepository.findAll();
    }

public Optional<EnderecoModel> buscarId(long id) {
        return enderecoRepository.findById();
}
public EnderecoModel cadastrarEndereco(EnderecoModel enderecoModel) {
        enderecoModel.getIdEndereco();
    enderecoModel.getCep();
    enderecoModel.getLougradouro();
enderecoModel.getNumero();
enderecoModel.getBairro();
enderecoModel.getPontoReferencia();

return enderecoRepository.save(enderecoModel);
}
public EnderecoModel alterarEndereco(EnderecoModel enderecoModel) {
        return enderecoModel.getCep();
        enderecoModel.getLougradouro();
        enderecoModel.getNumero();
        enderecoModel.getBairro();
        enderecoModel.getPontoReferencia();

        return enderecoRepository.save(enderecoModel);
}

public void deletarendereco(long id) {
        return enderecoRepository.deleteById(id);
}
}
