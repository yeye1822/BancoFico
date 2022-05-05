package com.challengebackend.mutant.controllers;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.challengebackend.mutant.models.dto.Statistics;
import com.challengebackend.mutant.models.entity.MutantEntity;
import com.challengebackend.mutant.models.service.impl.MutantServiceImpl;

class StateMutantControllerTest {

	@InjectMocks
	private MutantControllers mutantControllers;

	@Mock
	private MutantServiceImpl mutantService;

	private Statistics statistics;

	private MutantEntity mutant;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);

		statistics = new Statistics();
		statistics.setHuman(100.0);
		statistics.setMutant(40.0);
		statistics.setRatio(40.0 - 100.0);

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
	void getStatisticsTest() {
		Mockito.when(mutantService.getStatistics()).thenReturn(statistics);
		assertNotNull(mutantControllers.getStatistics());
	}

	@Test
	void createMutantTrueTest() {

		mutant.setIsMutant(true);
		Mockito.when(mutantService.save(mutant)).thenReturn(mutant);
		assertNotNull(mutantControllers.createMutant(mutant));
	}

	@Test
	void createMutantFalseTest() {

		mutant.setIsMutant(false);
		Mockito.when(mutantService.save(mutant)).thenReturn(mutant);
		assertNotNull(mutantControllers.createMutant(mutant));
	}

}
