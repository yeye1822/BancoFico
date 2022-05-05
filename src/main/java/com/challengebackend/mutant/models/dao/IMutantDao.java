package com.challengebackend.mutant.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.challengebackend.mutant.models.entity.MutantEntity;

public interface IMutantDao extends CrudRepository<MutantEntity, Long> {

	@Query(value = "SELECT count(*) FROM tbl_mutant where is_mutant= '1'", nativeQuery = true)
	public Long isMutant();
	
	@Query(value = "SELECT count(*) FROM tbl_mutant where is_mutant= '0'", nativeQuery = true)
	public Long isHuman();
	
}
