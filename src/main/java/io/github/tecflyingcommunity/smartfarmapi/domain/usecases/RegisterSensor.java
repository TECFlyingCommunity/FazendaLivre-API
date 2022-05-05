package io.github.tecflyingcommunity.smartfarmapi.domain.usecases;

import org.springframework.stereotype.Service;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.repositories.SensorRepository;

@Service
public class RegisterSensor {
	
	private final SensorRepository sensorRepository;

	public RegisterSensor(SensorRepository sensorRepository) {
		this.sensorRepository = sensorRepository;
	}
	
	public void save(SensorDTO sensorDto) {
		sensorRepository.save(sensorDto.toEntity());
	}

}
