package com.multiva.cecoban.transactionlog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {//extends SpringBootServletInitializer

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	//configuration for deploying a war file
	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(Application.class);
	}*/
}
