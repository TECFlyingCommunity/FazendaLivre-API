package io.github.tecflyingcommunity.smartfarmapi.domain.dtos;

import io.github.tecflyingcommunity.smartfarmapi.domain.entities.SensorEntity;

public record SensorDTO(Long id,

		Double temperature,

		Double luminosity,

		Double airHumidity,

		Double soilHumidity) {

	public SensorDTO(SensorEntity entity) {
		this(entity.getId(), entity.getTemperature(), entity.getLuminosity(), entity.getAirHumidity(),
				entity.getSoilHumidity());
	}

	public SensorEntity toEntity() {
		final SensorEntity entity = new SensorEntity();
		entity.setId(this.id);
		entity.setTemperature(this.temperature);
		entity.setLuminosity(this.luminosity);
		entity.setAirHumidity(this.airHumidity);
		entity.setSoilHumidity(this.soilHumidity);
		return entity;
	}
}
