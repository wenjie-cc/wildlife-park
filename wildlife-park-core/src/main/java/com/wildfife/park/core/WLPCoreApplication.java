package com.wildfife.park.core;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@Log4j2
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class WLPCoreApplication {

	@Value("${server.port}")
	private String port;

	public static void main(String[] args) {
		SpringApplication.run(WLPCoreApplication.class, args);
	}

	@Bean("initStarter")
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
		return args -> {
			log.info(">>wildlife-park-core is Up at: "+ port);
		};
	}

}
