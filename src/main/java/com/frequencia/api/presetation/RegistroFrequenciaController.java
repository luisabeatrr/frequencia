package com.frequencia.api.presetation;

import com.frequencia.api.application.dto.registro.RegistroRequestDto;
import com.frequencia.api.application.dto.registro.RegistroResponseDto;
import com.frequencia.api.application.services.RegistroFrequenciaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registros")
public class RegistroFrequenciaController {

    private final RegistroFrequenciaService service;

    public RegistroFrequenciaController(RegistroFrequenciaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<RegistroResponseDto> criar(@RequestBody RegistroRequestDto dto) {
        return ResponseEntity.ok(service.criar(dto));
    }

    @GetMapping
    public ResponseEntity<List<RegistroResponseDto>> listar() {
        return ResponseEntity.ok(service.listar());
    }
}
