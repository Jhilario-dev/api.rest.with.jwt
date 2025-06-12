package com.reto.proyecto.inicial.reto;

import org.springframework.boot.SpringApplication;

public class TestRetoApiRestApplication {

	public static void main(String[] args) {
		SpringApplication.from(RetoApiRestApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
