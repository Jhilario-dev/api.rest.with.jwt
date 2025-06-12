package com.reto.proyecto.inicial.reto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class RetoApiRestApplicationTests {

	@Test
	void contextLoads() {
	}

}
