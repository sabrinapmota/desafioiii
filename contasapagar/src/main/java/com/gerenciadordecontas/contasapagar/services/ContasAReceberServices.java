package com.gerenciadordecontas.contasapagar.services;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import com.gerenciadordecontas.contasapagar.model.enums.RecebimentosAlugueis;
import com.gerenciadordecontas.contasapagar.model.enums.TipoRecebimento;
import com.gerenciadordecontas.contasapagar.model.factory.AlugueisFactory;
import com.gerenciadordecontas.contasapagar.repository.IContasAReceberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
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
public ContasAReceberModel cadastrarConta(ContasAReceberModel contasAReceberModel, AlugueisFactory alugueisFactory) {
        if (contasAReceberModel.getTipoRecebimento().equals(TipoRecebimento.ALUGUEIS)) {
            LocalDate atualDate = LocalDate.now();
            if (contasAReceberModel.getDataVencimento().isBefore(atualDate)) {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.ATRASO);} else  if (contasAReceberModel.getDataVencimento().isAfter(atualDate)) {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.ADIANTADO);
            } else  {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.EMDIA);
            }
            BigDecimal resultado = alugueisFactory.calculoAloguel()
        }
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
