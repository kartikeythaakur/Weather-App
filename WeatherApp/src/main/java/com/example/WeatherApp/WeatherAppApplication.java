package com.example.WeatherApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherAppApplication.class, args);
		System.out.println(" ");
		System.out.println("Weather App is running successfully");
	}

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate(); // Create and return the RestTemplate bean
	}

}
