package com.gerenciadordecontas.contasapagar.model.factory;

import com.gerenciadordecontas.contasapagar.model.ICalculoAloguel;

import java.math.BigDecimal;

public class CalculoAluguelDia implements ICalculoAloguel {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        return valorAReceber;
    }
}
