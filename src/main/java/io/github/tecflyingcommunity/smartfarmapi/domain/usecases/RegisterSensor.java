package io.github.tecflyingcommunity.smartfarmapi.domain.usecases;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.NewSensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;
import io.github.tecflyingcommunity.smartfarmapi.domain.repositories.SensorRepository;
import org.springframework.stereotype.Service;

@Service
public class RegisterSensor {

    private final SensorRepository sensorRepository;

    public RegisterSensor(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public SensorEntity save(NewSensorDTO newSensorDTO) {
        return sensorRepository.save(newSensorDTO);
    }

}
