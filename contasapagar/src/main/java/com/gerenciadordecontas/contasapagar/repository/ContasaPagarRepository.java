package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.ContasaPagarModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContasaPagarRepository extends JpaRepository<ContasaPagarModel, Long> {
}
