package io.github.tecflyingcommunity.smartfarmapi.domain.usecases;

import io.github.tecflyingcommunity.smartfarmapi.domain.dtos.SensorDTO;
import io.github.tecflyingcommunity.smartfarmapi.domain.exceptions.ObjectNotFoundException;
import io.github.tecflyingcommunity.smartfarmapi.domain.repositories.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class SensorSearch {
    private final SensorRepository sensorRepository;

    public SensorSearch(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }


    public SensorDTO searchSensorById(Long id) {
        return  sensorRepository.findById(id).orElseThrow(
                () -> new ObjectNotFoundException(
                        "Endereço não encontrado! Id: " + id + ", Tipo: " + SensorDTO.class.getName())
        );
    }

    public List<SensorDTO> searchSensorAll() {
        return sensorRepository.findAll();
    }
}
