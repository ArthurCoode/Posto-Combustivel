package com.arthur.posto_combustivel.infrastructure.repository;

import com.arthur.posto_combustivel.infrastructure.entities.Abastecimento;
import com.arthur.posto_combustivel.infrastructure.entities.BombasDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Integer> {
}
