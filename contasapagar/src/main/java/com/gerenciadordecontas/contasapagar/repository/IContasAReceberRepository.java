package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.ContasAReceberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IContasAReceberRepository extends JpaRepository<ContasAReceberModel, Long> {
    List<ContasAReceberModel> findByStatus(String status);
    List<ContasAReceberModel> findByTipoRecebido(TipoRecebido tipoRecebido);
    List<ContasAReceberModel> findByDataDeVencimento(LocalDate dataVencimento);
}
