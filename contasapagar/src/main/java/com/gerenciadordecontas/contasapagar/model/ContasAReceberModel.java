package com.gerenciadordecontas.contasapagar.model;

import com.gerenciadordecontas.contasapagar.model.enums.RecebimentosAlugueis;
import com.gerenciadordecontas.contasapagar.model.enums.TipoRecebimento;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CONTAS_A_RECEBER")
public class ContasAReceberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(length = 10, nullable = false)
    private String status;

    @Column(length = 20, nullable = false)
    private String recebimento;

    @Column(length = 10, nullable = false)
    private BigDecimal valorRecebido;

private  BigDecimal valorFinal;

    @Column(length = 8, nullable = false)
    private LocalDate dataVencimento;

    @Column(length = 8, nullable = false)
    private LocalDate dataRecebimento;

@Column(length = 20, nullable = false)
    private TipoRecebimento tipoRecebimento;
private RecebimentosAlugueis recebimentosAlugueis;
}
