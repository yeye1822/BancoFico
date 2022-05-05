package com.challengebackend.mutant.models.service;

import com.challengebackend.mutant.models.dto.Statistics;
import com.challengebackend.mutant.models.entity.MutantEntity;

public interface IMutantService {

	public MutantEntity save(MutantEntity mutant);

	public Statistics getStatistics();

}
