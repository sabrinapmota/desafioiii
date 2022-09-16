package com.gerenciadordecontas.contasapagar.model;

import java.math.BigDecimal;

public interface ICalculoAloguel {
    BigDecimal calcular(BigDecimal valorAReceber);
}
