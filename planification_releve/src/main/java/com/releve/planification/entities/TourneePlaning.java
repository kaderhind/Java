package com.releve.planification.entities;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class TourneePlaning {

	private int reference;
	private Releveur releveur;
	@Temporal(value = TemporalType.DATE)
	private Date dernierDateLecture;
	private int fac_prod;
	private int cd_frn;
	private Date dateDebut;
	private Date dateFin;

	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public Releveur getReleveur() {
		return releveur;
	}
	public void setReleveur(Releveur releveur) {
		this.releveur = releveur;
	}
	public Date getDernierDateLecture() {
		return dernierDateLecture;
	}
	public void setDernierDateLecture(Date dernierDateLecture) {
		this.dernierDateLecture = dernierDateLecture;
	}
	public int getFac_prod() {
		return fac_prod;
	}
	public void setFac_prod(int fac_prod) {
		this.fac_prod = fac_prod;
	}
	public int getCd_frn() {
		return cd_frn;
	}
	public void setCd_frn(int cd_frn) {
		this.cd_frn = cd_frn;
	}
	
}
