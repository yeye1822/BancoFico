package com.challengebackend.mutant.models.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.challengebackend.mutant.models.dao.IMutantDao;
import com.challengebackend.mutant.models.dto.Statistics;
import com.challengebackend.mutant.models.entity.MutantEntity;
import com.challengebackend.mutant.models.service.IMutantService;

@Service
public class MutantServiceImpl implements IMutantService {

	@Autowired
	private IMutantDao mutantDao;

	@Override
	@Transactional
	public MutantEntity save(MutantEntity mutant) {

		String[] dna = new String[mutant.getDna().size()];

		for (int i = 0; i < mutant.getDna().size(); i++) {
			dna[i] = mutant.getDna().get(i);
		}

		mutant.setDnaCadena(Arrays.toString(dna));
		mutant.setIsMutant((checkHorizontal(dna) || checkVertical(dna) || checkDiagonals(dna)) ? true : false);

		return mutantDao.save(mutant);
	}

	@Override
	@Transactional(readOnly = true)
	public Statistics getStatistics() {
		Statistics statistics = new Statistics();

		Double isMutant = mutantDao.isMutant().doubleValue();
		Double isHuman = mutantDao.isHuman().doubleValue();
		Double ratio = isMutant / isHuman;
		
		BigDecimal ratioData = new BigDecimal(ratio).setScale(1, RoundingMode.HALF_UP);

		statistics.setMutant(isMutant);
		statistics.setHuman(isHuman);
		statistics.setRatio(ratioData.doubleValue());

		return statistics;
	}

	private static Boolean checkVertical(String[] dna) {

		List<String> dnaVertical = new ArrayList<>();

		for (int j = 0; j < dna.length; j++) {
			StringBuilder value = new StringBuilder("");
			for (String data : dna) {
				value.append(data.charAt(j));
			}

			dnaVertical.add(value.toString());
		}

		return checkHorizontal(coverListToArray(dnaVertical));
	}

	private static Boolean checkHorizontal(String[] dna) {

		for (String data : dna) {
			if (data.contains("CCCC") || data.contains("AAAA") || data.contains("TTTT") || data.contains("GGGG")) {
				return true;
			}
		}

		return false;
	}

	private static Boolean checkDiagonals(String[] dna) {

		List<String> dnaTotal = new ArrayList<>();
		List<String> dnaInverso = Arrays.asList(dna);

		Collections.reverse(dnaInverso);

		dnaTotal.addAll(checkDiagonalsLeft(dna));
		dnaTotal.addAll(checkDiagonalsLeft(coverListToArray(dnaInverso)));
		dnaTotal.addAll(checkDiagonalsRight(dna));
		dnaTotal.addAll(checkDiagonalsRight(coverListToArray(dnaInverso)));

		return checkHorizontal(coverListToArray(dnaTotal));
	}

	private static List<String> checkDiagonalsLeft(String[] dna) {

		List<String> dnaVertical = new ArrayList<>();
		int n;

		for (int j = dna.length - 1; j >= 0; j--) {
			StringBuilder value = new StringBuilder("");

			n = j;
			for (String data : dna) {
				if (n < 0) {
					break;
				}
				value.append(data.charAt(n));
				n--;
			}

			dnaVertical.add(value.toString());
		}

		return dnaVertical;
	}

	private static List<String> checkDiagonalsRight(String[] dna) {

		List<String> dnaVertical = new ArrayList<>();
		int n;

		for (int j = 0; j < dna.length; j++) {
			StringBuilder value = new StringBuilder("");

			n = j;

			for (String data : dna) {
				if (n > dna.length - 1) {
					break;
				}
				value.append(data.charAt(n));
				n++;
			}

			dnaVertical.add(value.toString());
		}

		return dnaVertical;
	}

	private static String[] coverListToArray(List<String> dna) {

		String[] dataArray = new String[dna.size()];
		dna.toArray(dataArray);

		return dataArray;
	}

}
