package com.gerenciadordecontas.contasapagar.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ESTADO_TB")
public class EstadoModel {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

@Column(length = 2, nullable = false)
    private String uf;

@Column(length = 10, nullable = false)
    private String nomeDestado;
}
