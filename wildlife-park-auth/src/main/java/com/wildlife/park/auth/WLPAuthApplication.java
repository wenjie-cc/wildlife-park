package com.wildlife.park.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WLPAuthApplication {
    // 尝试一下
	public static void main(String[] args) {
		SpringApplication.run(WLPAuthApplication.class, args);
	}

}
