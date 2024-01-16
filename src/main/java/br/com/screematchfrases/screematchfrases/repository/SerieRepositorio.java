package br.com.screematchfrases.screematchfrases.repository;

import br.com.screematchfrases.screematchfrases.model.Frase;
import br.com.screematchfrases.screematchfrases.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SerieRepositorio extends JpaRepository<Serie, Long> {
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Optional<Frase> frasesAleatorias();
}
