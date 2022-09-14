package com.gerenciadordecontas.contasapagar.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CIDADE_TB")

public class CidadeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(length = 40, nullable = false)
    private String nomeCidade
}
