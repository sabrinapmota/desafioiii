package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.CidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IcidadeRpository extends JpaRepository<CidadeModel, Long> {
}
