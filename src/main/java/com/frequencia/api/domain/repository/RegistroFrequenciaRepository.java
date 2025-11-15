package com.frequencia.api.domain.repository;

import com.frequencia.api.domain.entities.RegistroFrequencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface RegistroFrequenciaRepository extends JpaRepository<RegistroFrequencia, Long> {

    Optional<RegistroFrequencia> findByNomeAlunoAndData(String nomeAluno, LocalDate data);
}
