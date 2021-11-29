package com.dailyactivityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DailyactivityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyactivityServiceApplication.class, args);
	}

}
