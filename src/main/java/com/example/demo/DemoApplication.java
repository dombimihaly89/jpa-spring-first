package com.example.demo;

import com.example.demo.persistence.entity.DomesticTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DomesticTransaction domesticTransaction = new DomesticTransaction();
	}

}
