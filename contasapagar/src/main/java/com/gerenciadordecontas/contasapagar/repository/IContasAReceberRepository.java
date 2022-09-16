package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import com.gerenciadordecontas.contasapagar.model.enums.TipoRecebimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IContasAReceberRepository extends JpaRepository<ContasAReceberModel, Long> {
    List<ContasAReceberModel> findByStatus(String status);
    List<ContasAReceberModel> findByTipoRecebimento(TipoRecebimento tipoRecebimento);
    List<ContasAReceberModel> findByDataVencimento(LocalDate dataVencimento);
}
