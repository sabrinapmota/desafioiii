package com.gerenciadordecontas.contasapagar.model.factory;

import com.gerenciadordecontas.contasapagar.model.ICalculoAloguel;

import java.math.BigDecimal;

public class CalculoAluguelAdiantado implements ICalculoAloguel {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber){
        BigDecimal desconto = valorAReceber.multiply(new BigDecimal() 0.05);
        BigDecimal resultado = valorAReceber.add(desconto);
        return resultado;
    }
}
