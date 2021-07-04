package com.v2soft.in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AmazonAdminServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonAdminServiceApplication.class, args);
		System.out.println("Welcome to spring boot");
	}

}
