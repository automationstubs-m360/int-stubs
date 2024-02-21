package com.m360.automation.intstubs;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableScheduling
public class IntStubsApplication {


	
	private RestTemplate restTemplate = new RestTemplate();

	public static void main(String[] args) {
		SpringApplication.run(IntStubsApplication.class, args);
	}

	@Scheduled(cron = "0 */3 * ? * *")
	public void runEvey5Minutes() {
		ResponseEntity<Object> response = restTemplate.getForEntity("https://int-stubs.onrender.com/api/intstubs/userdata", Object.class);
		System.out.println("Response from int-stubs: " + response.getBody());
	}

}
