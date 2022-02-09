package com.Gatewey.gateweyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GateweyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateweyServiceApplication.class, args);
	}

}
