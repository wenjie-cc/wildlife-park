package com.wildlife.park.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yan
 * @desc WLPEureka
 * @date 2020/4/10
 */
@SpringBootApplication
@EnableEurekaServer
public class WLPEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(WLPEurekaApplication.class);
    }
}
