package com.reto.proyecto.inicial.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class RetoApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoApiRestApplication.class, args);
	}

}
