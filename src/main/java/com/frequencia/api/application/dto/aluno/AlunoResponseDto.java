package com.frequencia.api.application.dto.aluno;

import com.frequencia.api.domain.entities.Aluno;

import java.time.LocalDate;

public record AlunoResponseDto(String nome, LocalDate dt_nascimento) {

    public AlunoResponseDto(Aluno aluno){
        this(
                aluno.getNome(),
                aluno.getDt_nascimento()
        );
    }

}
