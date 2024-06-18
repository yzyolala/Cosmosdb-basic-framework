package com.example.AzureTest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.azure.spring.data.cosmos.repository.config.EnableCosmosRepositories;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AzureTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureTestApplication.class, args);
	}
}
