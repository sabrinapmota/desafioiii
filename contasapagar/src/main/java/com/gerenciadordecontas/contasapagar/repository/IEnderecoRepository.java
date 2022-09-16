package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEnderecoRepository extends JpaRepository<EnderecoModel, Long> {
    }
