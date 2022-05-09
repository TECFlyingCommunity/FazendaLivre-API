package io.github.tecflyingcommunity.smartfarmapi.data.repositories;

import io.github.tecflyingcommunity.smartfarmapi.data.datasources.SensorDataSource;
import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.NewSensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;
import io.github.tecflyingcommunity.smartfarmapi.domain.repositories.SensorRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class SensorRepositoryImpl implements SensorRepository {

    private final SensorDataSource sensorDataSource;

    public SensorRepositoryImpl(SensorDataSource sensorDataSource) {
        this.sensorDataSource = sensorDataSource;
    }

    @Override
    public List<SensorDTO> findAll() {
        return sensorDataSource.findAll().stream().map(SensorDTO::new).toList();
    }

    @Override
    public Optional<SensorDTO> findById(UUID id) {
        return sensorDataSource.findById(id).map(SensorDTO::new);
    }

    @Override
    public SensorEntity save(NewSensorDTO newSensorDTO) {
        return sensorDataSource.save(newSensorDTO.toEntity());
    }

}
