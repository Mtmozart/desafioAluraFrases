package br.com.screematchfrases.screematchfrases.repository;

import br.com.screematchfrases.screematchfrases.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SerieRepositorio extends JpaRepository<Serie, Long> {
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);
}
