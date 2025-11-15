package com.frequencia.api.presetation;

import com.frequencia.api.application.dto.aluno.AlunoRequestDto;
import com.frequencia.api.application.dto.aluno.AlunoResponseDto;
import com.frequencia.api.application.services.AlunoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
@Tag(name = "Aluno controller",description = "Controller responsavel pelo controle de funções de aluno!")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;


    @PostMapping("/cadastro")
    @Operation(summary = "Cadastro", description = "Método responsavel por efetuar o cadastro do aluno!")
    public ResponseEntity<AlunoResponseDto> cadastro(@RequestBody AlunoRequestDto requestDto){
        try{
            return ResponseEntity.ok(alunoService.cadastro(requestDto));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.badRequest().body(null);
        }
    }
    
}
