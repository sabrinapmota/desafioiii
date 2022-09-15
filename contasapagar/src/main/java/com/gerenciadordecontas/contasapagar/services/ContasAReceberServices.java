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
import java.time.LocalDateTime;
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

    public List<ContasAReceberModel> buscarStatus(String status) {
        return contasAReceberRepository.findByStatus(status);
    }

    public List<ContasAReceberModel> buscarTipo(TipoRecebimento tipoRecebimento) {
        return contasAReceberRepository.findByTipoRecebido(tipoRecebimento);
    }

    public List<ContasAReceberModel> buscarVincimento(String dataVencimento) {
        LocalDate localDate = LocalDate.parse(dataVencimento);
        return contasAReceberRepository.findByDataDeVencimento(localDate);
    }

    public ContasAReceberModel cadastrarConta(ContasAReceberModel contasAReceberModel, AlugueisFactory alugueisFactory) {
        LocalDate atualDate = LocalDate.now();

        if (contasAReceberModel.getTipoRecebimento().equals(TipoRecebimento.ALUGUEIS)) {
            if (contasAReceberModel.getDataVencimento().isBefore(atualDate)) {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.ATRASO);
            } else if (contasAReceberModel.getDataVencimento().isAfter(atualDate)) {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.ADIANTADO);
            } else {
                contasAReceberModel.setRecebimentosAlugueis(RecebimentosAlugueis.EMDIA);
            }
            BigDecimal resultado = alugueisFactory.calculoAloguel(contasAReceberModel.getValorRecebido());
            contasAReceberModel.setValorFinal(resultado);
        }
        return contasAReceberRepository.save(contasAReceberModel);
    }

    public ContasAReceberModel alterar(ContasAReceberModel contasAReceberModel) {
        if ("pago".equalsIgnoreCase(contasAReceberModel.getStatus())) {
            LocalDateTime dataAtual = LocalDateTime.now();
            contasAReceberModel.setDataRecebimento(dataAtual);
        }

        public void deletarconta (Long id) {
            contasAReceberRepository.deleteById(id);
        }
    }
}
