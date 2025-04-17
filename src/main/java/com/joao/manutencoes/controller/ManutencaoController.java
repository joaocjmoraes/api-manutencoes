package com.joao.manutencoes.controller;

import com.joao.manutencoes.model.Manutencao;
import com.joao.manutencoes.service.ManutencaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/api/manutencao")
public class ManutencaoController {

    @Autowired
    private ManutencaoService manutencaoService;

    // Rota para obter todas as manutenções
    @GetMapping
    public List<Manutencao> getAllManutencao() {
        return manutencaoService.getAllManutencao();
    }

    // Rota para adicionar uma nova manutenção
    @PostMapping
    public Manutencao createManutencao(@RequestBody @Valid Manutencao manutencao) {
        return manutencaoService.createManutencao(manutencao);
    }

    // Rota para atualizar uma manutenção existente
    @PutMapping("/{id}")
    public ResponseEntity<Manutencao> updateManutencao(
            @PathVariable Long id,
            @RequestBody @Valid Manutencao manutencao
    ) {
        Manutencao updatedManutencao = manutencaoService.updateManutencao(id, manutencao);
        if (updatedManutencao != null) {
            return ResponseEntity.ok(updatedManutencao);
        }
        return ResponseEntity.notFound().build();
    }

    // Rota para excluir uma manutenção
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteManutencao(@PathVariable Long id) {
        if (manutencaoService.deleteManutencao(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}