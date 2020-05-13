package com.wildlife.park.eureka;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author yan
 * @desc WLPEureka
 * @date 2020/4/10
 */
@Log4j2
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    @Value("${server.port}")
    private String port;

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }

    @Bean("initStarter")
    public CommandLineRunner commandLineRunner(ApplicationContext applicationContext){
        return args -> {
            log.info(">> wildlife-park-eureka is Up at: "+ port);
        };
    }
}
