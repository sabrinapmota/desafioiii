package com.gerenciadordecontas.contasapagar.model.factory;

import com.gerenciadordecontas.contasapagar.model.ICalculoAloguel;

import java.math.BigDecimal;

public class CalculoAluguelAtraso implements ICalculoAloguel {
    @Override
    public BigDecimal calcular(BigDecimal valorAReceber) {
        BigDecimal multaAtraso = valorAReceber.multiply(new BigDecimal(0.035));
        BigDecimal resultado = valorAReceber.add(multaAtraso);
        return valorAReceber;
    }
}
