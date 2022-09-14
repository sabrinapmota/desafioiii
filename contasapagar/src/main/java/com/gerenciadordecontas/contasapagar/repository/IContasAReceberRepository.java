package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContasAReceberRepository extends JpaRepository<ContasAReceberModel, Long> {
}
