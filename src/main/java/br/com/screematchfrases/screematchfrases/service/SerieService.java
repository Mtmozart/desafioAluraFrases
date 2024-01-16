package br.com.screematchfrases.screematchfrases.service;

import br.com.screematchfrases.screematchfrases.dto.FraseDTO;
import br.com.screematchfrases.screematchfrases.dto.SerieDTO;
import br.com.screematchfrases.screematchfrases.repository.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class SerieService {
    @Autowired
    private SerieRepositorio repositorio;


    public List<FraseDTO> obterSerieAleatorias() {
        return repositorio.frasesAleatorias().stream()
                .map(f -> new FraseDTO(f.getAutor(), f.getFrase(), f.getSerie().getTitulo(), f.getSerie().getPoster())
                )
                .collect(Collectors.toList());
    }
}
