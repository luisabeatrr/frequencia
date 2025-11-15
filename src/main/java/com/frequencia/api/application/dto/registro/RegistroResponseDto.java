package com.frequencia.api.application.dto.registro;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class RegistroResponseDto {
    private Long id;
    private String nomeAluno;
    private LocalDate data;
    private String status;

    public RegistroResponseDto() {
    }

    public RegistroResponseDto(Long id, String nomeAluno, LocalDate data, String status) {
        this.id = id;
        this.nomeAluno = nomeAluno;
        this.data = data;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
