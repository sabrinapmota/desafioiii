package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.ContasaPagarModel;
import com.gerenciadordecontas.contasapagar.model.enums.Status;
import com.gerenciadordecontas.contasapagar.model.enums.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContasaPagarRepository extends JpaRepository<ContasaPagarModel, Long> {
    public List<ContasaPagarModel> findByTipo(Tipo tipo);

    public List<ContasaPagarModel> findByStatus(Status status);
}
