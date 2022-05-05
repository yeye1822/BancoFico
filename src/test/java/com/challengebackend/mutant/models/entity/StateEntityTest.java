package com.challengebackend.mutant.models.entity;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

class StateEntityTest {

	private MutantEntity mutant;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		List<String> dna = new ArrayList<>();
		dna.add("CTGCTA");
		dna.add("CAGTGC");
		dna.add("TTCTGT");
		dna.add("AGTGGA");
		dna.add("CTGCTA");
		dna.add("GCACTA");

		mutant = new MutantEntity();
		mutant.setDnaCadena("[CTGCTA, CAGTGC, TTCTGT, AGTGGA, CTGCTA, GCACTA]");
		mutant.setId(Long.parseLong("1"));
		mutant.setIsMutant(true);
		mutant.setDna(dna);

	}

	@Test
	void entityTest() {

		assertNotNull(mutant.getDna());
		assertNotNull(mutant.getDnaCadena());
		assertNotNull(mutant.getIsMutant());
		assertNotNull(String.valueOf(mutant.getId()));
	}

}
