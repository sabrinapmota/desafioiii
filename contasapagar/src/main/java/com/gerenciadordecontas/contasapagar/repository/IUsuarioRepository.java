package com.gerenciadordecontas.contasapagar.repository;

import com.gerenciadordecontas.contasapagar.model.UsuarioModel;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
