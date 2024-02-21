package com.m360.automation.intstubs;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class IntStubsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntStubsApplication.class, args);
	}

	@Scheduled(cron = "0 */3 * ? * *")
	public void runEvey5Minutes() {
		System.out.println("Current time is :: " + LocalDateTime.now());
	}

}
