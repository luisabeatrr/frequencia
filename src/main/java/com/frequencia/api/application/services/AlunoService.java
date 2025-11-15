package com.frequencia.api.application.services;

import com.frequencia.api.application.dto.aluno.AlunoRequestDto;
import com.frequencia.api.application.dto.aluno.AlunoResponseDto;
import com.frequencia.api.domain.entities.Aluno;
import com.frequencia.api.domain.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoResponseDto cadastro(AlunoRequestDto requestDto) throws Exception{

        var response = alunoRepository.findByNome(requestDto.nome());

        if (response.isPresent()){
            throw new Exception("aluno já existente");
        }

        Aluno aluno = new Aluno();

        aluno.setNome(requestDto.nome());
        aluno.setDt_nascimento(requestDto.dt_nascimento());
        aluno.setId(null);

        alunoRepository.save(aluno);

        return new AlunoResponseDto(aluno);
    }


}
