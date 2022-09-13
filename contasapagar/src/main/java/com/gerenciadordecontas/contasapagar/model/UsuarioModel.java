package com.gerenciadordecontas.contasapagar.model;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "USUARIO_TB")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20, nullable = false)
    private String nome;
    @Column(length = 10, nullable = false)
private LocalDate dataNascimento;
    @Column(length = 11, nullable = false)
    @CPF
    private String cpf;
    @Column(length = 20, nullable = false)
    @Email
    private String email;
}
