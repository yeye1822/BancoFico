package com.challengebackend.mutant.models.service.impl;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.challengebackend.mutant.models.dao.IMutantDao;
import com.challengebackend.mutant.models.entity.MutantEntity;

class StateServiceTest {

	@InjectMocks
	private MutantServiceImpl mutantServiceImpl;

	@Mock
	private IMutantDao mutantDao;

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
	void getStatisticsTest() {
		Mockito.when(mutantDao.isMutant()).thenReturn(Long.parseLong("100"));
		Mockito.when(mutantDao.isHuman()).thenReturn(Long.parseLong("40"));

		assertNotNull(mutantServiceImpl.getStatistics());
	}

	@Test
	void saveTest() {
		Mockito.when(mutantDao.save(mutant)).thenReturn(mutant);
		assertNotNull(mutantServiceImpl.save(mutant));

	}

}
