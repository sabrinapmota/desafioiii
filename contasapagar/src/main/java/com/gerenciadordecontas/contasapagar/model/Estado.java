package com.gerenciadordecontas.contasapagar.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ESTADO_TB")
public class Estado {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEstado;

@Column(length = 2, nullable = false)
    private String uf;

@Column(length = 10, nullable = false)
    private String nomeDestado;
}
