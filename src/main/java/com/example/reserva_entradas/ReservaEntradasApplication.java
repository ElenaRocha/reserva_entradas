package com.example.reserva_entradas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ReservaEntradasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservaEntradasApplication.class, args);
	}

}
