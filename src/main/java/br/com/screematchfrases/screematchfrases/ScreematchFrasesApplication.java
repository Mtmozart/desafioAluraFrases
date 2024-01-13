package br.com.screematchfrases.screematchfrases;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreematchFrasesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreematchFrasesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Online");
	}
}
