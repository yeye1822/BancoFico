package com.challengebackend.mutant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.challengebackend.mutant.models.dto.Statistics;
import com.challengebackend.mutant.models.entity.MutantEntity;
import com.challengebackend.mutant.models.service.IMutantService;

@CrossOrigin(origins = "*")
@RestController
public class MutantControllers {

	@Autowired
	private IMutantService mutantService;

	@PostMapping("/mutant")
	public ResponseEntity<MutantEntity> createMutant(@RequestBody MutantEntity mutant) {

		MutantEntity mutantEntity = mutantService.save(mutant);

		if (!mutantEntity.getIsMutant()) {
			return new ResponseEntity(HttpStatus.FORBIDDEN);
		}
		
		return new ResponseEntity(HttpStatus.OK);	
	}

	@GetMapping("/stats")
	@ResponseStatus(HttpStatus.OK)
	public Statistics getStatistics() {
		return mutantService.getStatistics();
	}
}
