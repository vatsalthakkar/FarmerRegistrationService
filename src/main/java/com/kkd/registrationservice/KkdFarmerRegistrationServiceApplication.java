/*
 * Authour: Vatsal Thakkar
 * Purpose: Main class 
 */

package com.kkd.registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.kkd.registrationservice")
public class KkdFarmerRegistrationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KkdFarmerRegistrationServiceApplication.class, args);
	}
}
