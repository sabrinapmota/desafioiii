package com.gerenciadordecontas.contasapagar.model.enums;

public enum TipoRecebimento {

    ALUGUEIS,
    EMPREGO_CLT,
FREELANCER;

    public TipoRecebimento getAlugueis() {
        return  ALUGUEIS;
    }

    public TipoRecebimento getEmpregoClt(){
        return EMPREGO_CLT;
    }

    public TipoRecebimento getFreelancer() {
        return FREELANCER;
    }
}
