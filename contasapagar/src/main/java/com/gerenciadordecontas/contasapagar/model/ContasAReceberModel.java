package com.gerenciadordecontas.contasapagar.model;

import com.gerenciadordecontas.contasapagar.model.enums.RecebimentosAlugueis;
import com.gerenciadordecontas.contasapagar.model.enums.TipoRecebimento;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_CONTAS_A_RECEBER")
public class ContasAReceberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 10, nullable = false)
    private String status;

    @Column(length = 20, nullable = false)
    private String recebimento;

    @Column(length = 10, nullable = false)
    private BigDecimal valorRecebido;

    private BigDecimal valorFinal;

    @Column(, nullable = false)
    private LocalDate dataVencimento;
    private LocalDateTime dataRecebimento;
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuarioModel;

    @Column(nullable = false)
    private TipoRecebimento tipoRecebimento;
    private RecebimentosAlugueis recebimentosAlugueis;

    public ContasAReceberModel(String status, String recebimento, BigDecimal valorRecebido, BigDecimal valorFinal, TipoRecebimento tipoRecebimento, RecebimentosAlugueis recebimentosAlugueis, LocalDate dataVencimento, LocalDateTime dataRecebimento, UsuarioModel usuarioModel) {
        this.status = status;
        this.recebimento = recebimento;
        this.valorRecebido = valorRecebido;
        this.valorFinal = valorFinal;
        this.dataRecebimento = dataRecebimento;
        this.dataVencimento = dataVencimento;
        this.tipoRecebimento = tipoRecebimento;
        this.recebimentosAlugueis = recebimentosAlugueis;
        this.usuarioModel = usuarioModel;
    }
}
