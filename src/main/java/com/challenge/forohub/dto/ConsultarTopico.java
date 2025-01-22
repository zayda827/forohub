package com.challenge.forohub.dto;

import java.time.LocalDateTime;

public record ConsultarTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha_Creacion,
        boolean status,
        String autor,
        String curso

) {
}
