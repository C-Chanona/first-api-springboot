package com.example.diagnostic.evaluation;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvaluationApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
		System.out.println("API PORT: " + dotenv.get("API_PORT"));
		SpringApplication.run(EvaluationApplication.class, args);
	}

}
