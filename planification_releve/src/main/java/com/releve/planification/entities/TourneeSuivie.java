package com.releve.planification.entities;

import java.util.Date;

public class TourneeSuivie {

	private int reference;
	private long nb_idx;
	private long nb_idx_lus;
	private long nb_idx_non_lus;
	private double avancement;
	private Date dateDebut;
	private Date dateFin;
	private Releveur releveur;
	private Date dateCharegement;
	private Date dateDechargement;
	private char etat;
	private int produit;
	
	public int getReference() {
		return reference;
	}
	public void setReference(int reference) {
		this.reference = reference;
	}
	public long getNb_idx() {
		return nb_idx;
	}
	public void setNb_idx(long nb_idx) {
		this.nb_idx = nb_idx;
	}
	public long getNb_idx_lus() {
		return nb_idx_lus;
	}
	public void setNb_idx_lus(long nb_idx_lus) {
		this.nb_idx_lus = nb_idx_lus;
	}
	public long getNb_idx_non_lus() {
		return nb_idx_non_lus;
	}
	public void setNb_idx_non_lus(long nb_idx_non_lus) {
		this.nb_idx_non_lus = nb_idx_non_lus;
	}
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
	
	public Date getDateCharegement() {
		return dateCharegement;
	}
	public void setDateCharegement(Date dateCharegement) {
		this.dateCharegement = dateCharegement;
	}
	public Date getDateDechargement() {
		return dateDechargement;
	}
	public void setDateDechargement(Date dateDechargement) {
		this.dateDechargement = dateDechargement;
	}
	public char getEtat() {
		return etat;
	}
	public void setEtat(char etat) {
		this.etat = etat;
	}
	public int getProduit() {
		return produit;
	}
	public void setProduit(int produit) {
		this.produit = produit;
	}
	public Releveur getReleveur() {
		return releveur;
	}
	public void setReleveur(Releveur releveur) {
		this.releveur = releveur;
	}
	public double getAvancement() {
			return avancement;
	}
	public void setAvancement(double a) {
		this.avancement = a;
	}
	
}
