package com.ironhack.purchaseruserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

public class PurchaserUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaserUserServiceApplication.class, args);
	}

}
