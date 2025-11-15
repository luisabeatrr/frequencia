package com.frequencia.api.application.dto.usuario;

public record UsuarioRequestDto(Long id, String nome, String CPF, String email, String senha, String role) {
}

