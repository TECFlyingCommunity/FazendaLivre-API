package io.github.tecflyingcommunity.smartfarmapi.domain.repositories;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;

public interface SensorRepository {
    List<SensorDTO> findAll();
    Optional<SensorDTO> findById(UUID id);
    SensorEntity save(SensorEntity sensorDto);
    
}
