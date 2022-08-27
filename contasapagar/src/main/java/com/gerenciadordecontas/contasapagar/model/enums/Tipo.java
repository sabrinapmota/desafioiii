package com.gerenciadordecontas.contasapagar.model.enums;

public enum Tipo {
    LUZ,
    AGUA,
    COMIDA,
    LAZER,
    OUTROS;

    public Tipo getAgua() {
        return AGUA;
    }

    public Tipo getLuz() {
        return LUZ;
    }

    public Tipo getComida() {
        return COMIDA;
    }

    public Tipo getLazer() {
        return LAZER;
    }

    public Tipo getOutros() {
        return OUTROS;
    }
}
