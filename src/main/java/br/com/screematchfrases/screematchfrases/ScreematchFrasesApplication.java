package br.com.screematchfrases.screematchfrases;

import br.com.screematchfrases.screematchfrases.principal.Principal;
import br.com.screematchfrases.screematchfrases.repository.SerieRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchFrasesApplication {


	public static void main(String[] args) {
		SpringApplication.run(ScreematchFrasesApplication.class, args);
	}

}
