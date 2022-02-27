package com.microservicios.app.futfem.matchdayplayersvisitante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosFutfemMatchdayPlayersVisitanteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosFutfemMatchdayPlayersVisitanteApplication.class, args);
	}

}
