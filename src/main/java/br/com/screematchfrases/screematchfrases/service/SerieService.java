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


    public List<SerieDTO> obterSerieAleatorias() {
        return repositorio.frasesAleatorias().stream()
                .map(s -> new SerieDTO(s.getId(), s.getTitulo(), s.getFrases()
                        .stream()
                        .map(f -> new FraseDTO(f.getAutor(),f.getFrase())
                        ).collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
                ;

        ;
    }
}
