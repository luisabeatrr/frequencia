package com.frequencia.api.application.services;

import com.frequencia.api.application.dto.registro.RegistroRequestDto;
import com.frequencia.api.application.dto.registro.RegistroResponseDto;
import com.frequencia.api.domain.entities.RegistroFrequencia;
import com.frequencia.api.domain.repository.RegistroFrequenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegistroFrequenciaService {

    private final RegistroFrequenciaRepository repository;

    public RegistroFrequenciaService(RegistroFrequenciaRepository repository) {
        this.repository = repository;
    }

    // Criar
    public RegistroResponseDto criar(RegistroRequestDto dto) {

        // Regra de negócio: impedir duplicidade
        repository.findByNomeAlunoAndData(dto.getNomeAluno(), dto.getData())
                .ifPresent(r -> {
                    throw new RuntimeException("Já existe um registro para esse aluno nessa data.");
                });

        RegistroFrequencia r = new RegistroFrequencia();
        r.setNomeAluno(dto.getNomeAluno());
        r.setData(dto.getData());
        r.setStatus(RegistroFrequencia.Status.valueOf(dto.getStatus()));

        RegistroFrequencia salvo = repository.save(r);

        return new RegistroResponseDto(
                salvo.getId(),
                salvo.getNomeAluno(),
                salvo.getData(),
                salvo.getStatus().name()
        );
    }

    // Listar
    public List<RegistroResponseDto> listar() {
        return repository.findAll()
                .stream()
                .map(r -> new RegistroResponseDto(
                        r.getId(),
                        r.getNomeAluno(),
                        r.getData(),
                        r.getStatus().name()
                ))
                .collect(Collectors.toList());
    }
}
