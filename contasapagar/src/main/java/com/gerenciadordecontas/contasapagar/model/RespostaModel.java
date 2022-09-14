package com.gerenciadordecontas.contasapagar.model;

import com.gerenciadordecontas.contasapagar.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RespostaModel {
    private Long codigo;
    private String nome;
    private double valor;
    private Status statusPag;
}
