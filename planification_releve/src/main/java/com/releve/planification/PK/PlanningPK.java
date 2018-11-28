package com.releve.planification.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PlanningPK implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="ref_tournee",insertable=false,updatable=false)
	private int reference;
	@Column(name="cd_frn",insertable=false,updatable=false)
	private char cd_frn;
	@Column(name="num_cycle",insertable=false,updatable=false)
	private int num_cycle;
	@Column(name="fac_prod",insertable=false,updatable=false)
	private int fac_prod;
	@Column(name="etape_tournee",insertable=false,updatable=false)
	private char etape_tournee;
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public char getCd_frn() {
		return cd_frn;
	}
	public void setCd_frn(char cd_frn) {
		this.cd_frn = cd_frn;
	}
	public int getNum_cycle() {
		return num_cycle;
	}
	public void setNum_cycle(int num_cycle) {
		this.num_cycle = num_cycle;
	}
	public int getFac_prod() {
		return fac_prod;
	}
	public void setFac_prod(int fac_prod) {
		this.fac_prod = fac_prod;
	}
	public char getEtape_tournee() {
		return etape_tournee;
	}
	public void setEtape_tournee(char etape_tournee) {
		this.etape_tournee = etape_tournee;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cd_frn;
		result = prime * result + etape_tournee;
		result = prime * result + fac_prod;
		result = prime * result + num_cycle;
		result = prime * result + reference;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlanningPK other = (PlanningPK) obj;
		if (cd_frn != other.cd_frn)
			return false;
		if (etape_tournee != other.etape_tournee)
			return false;
		if (fac_prod != other.fac_prod)
			return false;
		if (num_cycle != other.num_cycle)
			return false;
		if (reference != other.reference)
			return false;
		return true;
	}
	
	
}
