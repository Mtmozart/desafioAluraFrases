package br.com.screematchfrases.screematchfrases.repository;

import br.com.screematchfrases.screematchfrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepositorio extends JpaRepository<Frase, Long> {
}
