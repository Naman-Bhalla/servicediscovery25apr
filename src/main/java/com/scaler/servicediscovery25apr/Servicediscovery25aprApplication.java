package com.scaler.servicediscovery25apr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Servicediscovery25aprApplication {

    public static void main(String[] args) {
        SpringApplication.run(Servicediscovery25aprApplication.class, args);
    }

}
