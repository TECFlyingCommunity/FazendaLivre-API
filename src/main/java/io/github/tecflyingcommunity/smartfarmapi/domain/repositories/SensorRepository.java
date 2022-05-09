package io.github.tecflyingcommunity.smartfarmapi.domain.repositories;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.NewSensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SensorRepository {
    List<SensorDTO> findAll();

    Optional<SensorDTO> findById(UUID id);

    SensorEntity save(NewSensorDTO newSensorDTO);
}
