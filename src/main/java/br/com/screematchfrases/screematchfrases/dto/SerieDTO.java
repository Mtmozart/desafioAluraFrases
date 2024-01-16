package br.com.screematchfrases.screematchfrases.dto;

import br.com.screematchfrases.screematchfrases.model.Frase;

import java.util.List;

public record SerieDTO(
        Long id,
        String Titulo,
        String poster,
        List<Frase> frase
) {
}
