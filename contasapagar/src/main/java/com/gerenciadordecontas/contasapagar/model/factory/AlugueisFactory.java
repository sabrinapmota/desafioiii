package com.gerenciadordecontas.contasapagar.model.factory;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import com.gerenciadordecontas.contasapagar.model.ICalculoAloguel;
import com.gerenciadordecontas.contasapagar.model.enums.RecebimentosAlugueis;

import java.util.ConcurrentModificationException;

public class AlugueisFactory {
    public ICalculoAloguel calculoAloguel(ContasAReceberModel contasAReceberModel) {
    if (contasAReceberModel.getRecebimentosAlugueis().equals(RecebimentosAlugueis.ADIANTADO)) {
        return new CalculoAluguelAdiantado();
    }else if (contasAReceberModel.getRecebimentosAlugueis().equals(RecebimentosAlugueis.EMDIA)) {
        return new CalculoAluguelDia();
    } else if (contasAReceberModel.getRecebimentosAlugueis().equals(RecebimentosAlugueis.ATRASO)) {
        return  new CalculoAluguelAtraso();
    } else {
        return null;
    }
    }

}