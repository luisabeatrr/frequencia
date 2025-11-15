package com.frequencia.api.application.dto.usuario;

import com.frequencia.api.domain.entities.Usuario;

public record UsuarioResponseDto(Long id, String nome, String CPF, String email) {

    public UsuarioResponseDto(Usuario usuario){
        this(
                usuario.getId(),
                usuario.getNome(),
                usuario.getCPF(),
                usuario.getEmail()
        );
    }
}
