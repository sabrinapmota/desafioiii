package com.gerenciadordecontas.contasapagar.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
@Table(name = "ENDERECO_TB")

public class EnderecoModel{
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(length = 100, nullable = false)
    String lougradouro;

@Column(length = 11, nullable = false)
    private String cep;

@Column(length = 100, nullable = false)
    private String pontoReferencia;
}

}
