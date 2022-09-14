package com.gerenciadordecontas.contasapagar.model.enums;

import java.security.PublicKey;

public enum RecebimentosAlugueis {
    ATRASO,
    EMDIA,
    ADIANTADO;

    public RecebimentosAlugueis getAtraso() {
        return ATRASO;
    }

    public RecebimentosAlugueis getEmdia() {
        return EMDIA;
    }

    public RecebimentosAlugueis getAdiantado() {
        return ADIANTADO;
    }
}

