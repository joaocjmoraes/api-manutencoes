package com.joao.manutencoes.repository;

import com.joao.manutencoes.model.Manutencao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long> {
    
}
