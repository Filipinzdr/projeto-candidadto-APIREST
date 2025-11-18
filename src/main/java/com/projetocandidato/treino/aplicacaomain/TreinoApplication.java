package com.projetocandidato.treino.aplicacaomain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class TreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TreinoApplication.class, args);
	}

	@Bean
	public CommandLineRunner pingOracle(DataSource ds) {
		return args -> {
			try (var conn = ds.getConnection()) {
				if (conn.isValid(2)) {
					System.out.println("Oracle OK");
				} else {
					System.err.println("Conexão inválida");
				}
			} catch (Exception e) {
				System.err.println("Falha ao conectar: " + e.getMessage());
			}
		};
	}


}




