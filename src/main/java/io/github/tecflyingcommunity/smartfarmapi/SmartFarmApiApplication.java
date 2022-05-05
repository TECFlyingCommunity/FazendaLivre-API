package io.github.tecflyingcommunity.smartfarmapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.usecases.RegisterSensor;

@SpringBootApplication
public class SmartFarmApiApplication implements CommandLineRunner {
	
	private final RegisterSensor register;

    public SmartFarmApiApplication(RegisterSensor register) {
		this.register = register;
	}

	public static void main(String[] args) {
        SpringApplication.run(SmartFarmApiApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		SensorDTO firstSensor = new SensorDTO(null, 26.3, 500.0, 15.0, 28.0);
		SensorDTO secondSensor = new SensorDTO(null, 29.3, 448.0, 14.8, 27.8);
		SensorDTO thirdSensor = new SensorDTO(null, 24.3, 449.0, 15.1, 28.0);
		SensorDTO fourthSensor = new SensorDTO(null, 26.3, 530.0, 14.8, 28.9);
		
		register.save(firstSensor);
		register.save(secondSensor);
		register.save(thirdSensor);
		register.save(fourthSensor);		
	}

}
