package com.challenge.forohub.dto;

import jakarta.validation.constraints.NotBlank;

public record RegistrarTopico (
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String autor,
        @NotBlank
        String curso
){
}
