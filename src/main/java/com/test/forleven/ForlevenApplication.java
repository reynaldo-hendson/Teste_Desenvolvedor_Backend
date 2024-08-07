package com.test.forleven;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(servers ={@Server(url = "/", description = "Default Server URL")})
public class ForlevenApplication {

	public String PORT = System.getenv("PORT");
	public static void main(String[] args) {
		SpringApplication.run(ForlevenApplication.class, args);
	}

}




