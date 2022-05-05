package com.challengebackend.mutant.models.dto;

import java.io.Serializable;

public class Statistics implements Serializable{
	
	private static final long serialVersionUID = -8710722957532513870L;

	private Double mutant;

	private Double human;

	private Double ratio;

	public Double getMutant() {
		return mutant;
	}

	public void setMutant(Double mutant) {
		this.mutant = mutant;
	}

	public Double getHuman() {
		return human;
	}

	public void setHuman(Double human) {
		this.human = human;
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

}
