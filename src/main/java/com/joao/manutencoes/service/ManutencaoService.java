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

    // Obter todas as manutenções
    public List<Manutencao> getAllManutencao() {
        return manutencaoRepository.findAll();
    }

    // Criar uma nova manutenção
    public Manutencao createManutencao(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    // Atualizar uma manutenção
    public Manutencao updateManutencao(Long id, Manutencao manutencao) {
        Optional<Manutencao> existingManutencao = manutencaoRepository.findById(id);
        if (existingManutencao.isPresent()) {
            manutencao.setId(id);
            return manutencaoRepository.save(manutencao);
        }
        return null; // Retorna null se não encontrar o id
    }

    // Deletar uma manutenção
    public boolean deleteManutencao(Long id) {
        Optional<Manutencao> manutencao = manutencaoRepository.findById(id);
        if (manutencao.isPresent()) {
            manutencaoRepository.deleteById(id);
            return true;
        }
        return false; // Retorna false se não encontrar o id
    }
}

