package com.frequencia.api.application.dto.aluno;


import java.time.LocalDate;

public record AlunoRequestDto(String nome, LocalDate dt_nascimento) {
}
