package io.github.tecflyingcommunity.smartfarmapi;

import io.github.tecflyingcommunity.smartfarmapi.domain.usecases.RegisterSensor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartFarmApiApplication {

    private final RegisterSensor register;

    public SmartFarmApiApplication(RegisterSensor register) {
        this.register = register;
    }

    public static void main(String[] args) {
        SpringApplication.run(SmartFarmApiApplication.class, args);
    }

}
