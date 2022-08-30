package com.gerenciadordecontas.contasapagar.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
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
