package com.test.forleven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ForlevenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForlevenApplication.class, args);
		System.out.println("Funcionando...");
	}

}
