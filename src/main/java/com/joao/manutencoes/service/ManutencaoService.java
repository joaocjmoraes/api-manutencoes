package com.joao.manutencoes.service;

import com.joao.manutencoes.model.Manutencao;
import com.joao.manutencoes.repository.ManutencaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManutencaoService {

    @Autowired
    private ManutencaoRepository manutencaoRepository;

    // Criar ou atualizar manutenção
    public Manutencao saveManutencao(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    // Buscar todas as manutenções
    public List<Manutencao> getAllManutencao() {
        return manutencaoRepository.findAll();
    }

    // Buscar por ID
    public Optional<Manutencao> getManutencaoById(Long id) {
        return manutencaoRepository.findById(id);
    }

    // Deletar por ID
    public void deleteManutencao(Long id) {
        manutencaoRepository.deleteById(id);
    }
}
