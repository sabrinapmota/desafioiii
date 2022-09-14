package com.gerenciadordecontas.contasapagar.model;

import com.gerenciadordecontas.contasapagar.model.enums.TipoRecebimento;
import lombok.*;
import org.hibernate.tool.schema.extract.spi.TableInformation;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TB_CONTAS_A_RECEBER")
public class ContasAReceberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contaAReceberID;
    @Column(length = 10, nullable = false)
    private String status;

    @Column(length = 20, nullable = false)
    private String recebimento;

    @Column(length = 10, nullable = false)
    private BigDecimal valorRecebido;

    @Column(length = 8, nullable = false)
    private LocalDate dataVencimento;

    @Column(length = 8, nullable = false)
    private LocalDate dataRecebimento;

    @Column(length = 15, nullable = false)
    @Enumerated(Value = EnumType.STRING)
    private TipoRecebimento tipoRecebimento;
}
