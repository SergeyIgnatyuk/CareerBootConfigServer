package com.careerboot.config.careerbootconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CareerBootConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareerBootConfigServerApplication.class, args);
    }

}
