package com.lium;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableCircuitBreaker
public class MicroserviceServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceServerApplication.class, args);
    }
}
