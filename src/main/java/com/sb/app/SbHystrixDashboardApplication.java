package com.sb.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class SbHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHystrixDashboardApplication.class, args);
	}

}
