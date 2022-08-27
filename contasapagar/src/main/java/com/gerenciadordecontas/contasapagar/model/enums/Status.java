package com.gerenciadordecontas.contasapagar.model.enums;

public enum Status {
    PAGO,
    AGUARDANDO,
    VENCIDO;

    public Status getPago() {
        return PAGO;
    }

    public Status getAguardando() {
        return AGUARDANDO;
    }

    public Status getVencido() {
        return VENCIDO;
    }
}
