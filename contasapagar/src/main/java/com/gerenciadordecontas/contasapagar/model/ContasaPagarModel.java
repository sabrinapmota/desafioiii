package com.gerenciadordecontas.contasapagar.model;

import com.gerenciadordecontas.contasapagar.model.enums.Status;
import com.gerenciadordecontas.contasapagar.model.enums.Tipo;
import lombok.*;
import org.hibernate.tool.schema.extract.spi.TableInformation;

import javax.persistence.*;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "gerenciador")

public class ContasaPagarModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String nome;

    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(length = 20, nullable = false)
    @Enumerated(value = EnumType.STRING)
    private Tipo tipo;

    @Column(length = 20, nullable = false)
    private Double valor;

    @Column(length = 20, nullable = false)
    private LocalDate dataVencimento;

    @Column(length = 20)
    private LocalDateTime dataPagamento;
    @Column
    @Enumerated (value = EnumType.STRING)
    private Status statusPag;
}
