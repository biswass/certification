package com.bits.certification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.bits.*")
public class CertificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificationApplication.class, args);
	}

}
