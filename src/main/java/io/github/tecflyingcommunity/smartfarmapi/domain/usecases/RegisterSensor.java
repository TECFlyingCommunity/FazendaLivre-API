package io.github.tecflyingcommunity.smartfarmapi.domain.usecases;

import org.springframework.stereotype.Service;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;
import io.github.tecflyingcommunity.smartfarmapi.domain.repositories.SensorRepository;

@Service
public class RegisterSensor {
	
	private final SensorRepository sensorRepository;

	public RegisterSensor(SensorRepository sensorRepository) {
		this.sensorRepository = sensorRepository;
	}
	
	public SensorEntity save(SensorDTO sensorDto) {
		return sensorRepository.save(sensorDto.toEntity());
	}

}
