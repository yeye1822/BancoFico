package com.challengebackend.mutant.models.dto;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class StateDTOTest {

	private Statistics statistics;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		statistics = new Statistics();
		statistics.setHuman(100.0);
		statistics.setMutant(40.0);
		statistics.setRatio(40.0 / 100.0);

	}

	@Test
	void entityTest() {

		assertNotNull(statistics.getHuman());
		assertNotNull(statistics.getMutant());
		assertNotNull(statistics.getRatio());
	}

}
