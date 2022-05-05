package com.challengebackend.mutant.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "tbl_mutant")
public class MutantEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "createDate")
	@Temporal(TemporalType.DATE)
	private Date createDate;

	@Transient
	private List<String> dna;

	@Column(name = "dnaCadena")
	private String dnaCadena;

	@Column(name = "isMutant")
	private Boolean isMutant;

	@PrePersist
	public void getCreateAt() {
		createDate = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<String> getDna() {
		return dna;
	}

	public void setDna(List<String> dna) {
		this.dna = dna;
	}

	public Boolean getIsMutant() {
		return isMutant;
	}

	public void setIsMutant(Boolean isMutant) {
		this.isMutant = isMutant;
	}

	public String getDnaCadena() {
		return dnaCadena;
	}

	public void setDnaCadena(String dnaCadena) {
		this.dnaCadena = dnaCadena;
	}

}
