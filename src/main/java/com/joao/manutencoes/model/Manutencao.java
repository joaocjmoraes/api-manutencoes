package com.joao.manutencoes.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;


@Entity
public class Manutencao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "A descrição não pode estar em branco.")
    @Size(min = 5, max = 150, message = "A descrição deve ter entre 5 e 150 caracteres.")
    private String descricao;

    @NotNull(message = "A data da manutenção é obrigatória.")
    private LocalDate data;

    @NotBlank(message = "O local da manutenção é obrigatório.")
    private String local;

    @NotBlank(message = "O responsável pela manutenção é obrigatório.")
    private String responsavel;

    private String tipo;

    @NotNull(message = "O status da manutenção é obrigatório (PENDENTE, EM_ANDAMENTO ou CONCLUIDA).")
    @Enumerated(EnumType.STRING)
    private Status status;

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}