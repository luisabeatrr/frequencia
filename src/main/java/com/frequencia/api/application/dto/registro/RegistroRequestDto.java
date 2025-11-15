package com.frequencia.api.application.dto.registro;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class RegistroRequestDto {
    private String nomeAluno;
    private LocalDate data;
    private String status;

    public RegistroRequestDto() {
    }

    public RegistroRequestDto(String nomeAluno, LocalDate data, String status) {
        this.nomeAluno = nomeAluno;
        this.data = data;
        this.status = status;
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
