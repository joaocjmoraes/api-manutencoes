package com.joao.manutencoes.controller;

import com.joao.manutencoes.model.Manutencao;
import com.joao.manutencoes.service.ManutencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoService manutencaoService;

    // Criar ou atualizar manutenção
    @PostMapping
    public Manutencao createManutencao(@RequestBody Manutencao manutencao) {
        return manutencaoService.saveManutencao(manutencao);
    }

    // Buscar todas as manutenções
    @GetMapping
    public List<Manutencao> getAllManutencao() {
        return manutencaoService.getAllManutencao();
    }

    // Buscar por ID
    @GetMapping("/{id}")
    public Optional<Manutencao> getManutencaoById(@PathVariable Long id) {
        return manutencaoService.getManutencaoById(id);
    }

    // Deletar por ID
    @DeleteMapping("/{id}")
    public void deleteManutencao(@PathVariable Long id) {
        manutencaoService.deleteManutencao(id);
    }
}

