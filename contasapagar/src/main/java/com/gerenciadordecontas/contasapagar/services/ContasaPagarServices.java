package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.ContasaPagarModel;
import com.gerenciadordecontas.contasapagar.model.enums.Status;
import com.gerenciadordecontas.contasapagar.repository.ContasaPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
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

        LocalDate dataAtual = LocalDate.now();
        if (contasaPagarModel.getDataVencimento().isBefore(dataAtual)) {
            contasaPagarModel.setStatus(Status.VENCIDO);
        } else {
            contasaPagarModel.setStatus(Status.AGUARDANDO);
        }
        return contasaPagarRepository.save(contasaPagarModel);
    }

    public ContasaPagarModel alterarContas(ContasaPagarModel contasaPagarModel) {
        ContasaPagarModel alteracaoConta = contasaPagarRepository.findById(contasaPagarModel.getId()).get();
        if (contasaPagarModel.getStatus() == Status.PAGO) {
            alteracaoConta.setDataPagamento(LocalDateTime.now(ZoneId.of("UTC-03:00")));
            alteracaoConta.setStatus(Status.PAGO);
        }

        return contasaPagarRepository.save(alteracaoConta);
    }

    public void deletarcontas(Long id) {
        contasaPagarRepository.deleteById(id);
    }
}
