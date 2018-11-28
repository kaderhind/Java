package com.releve.planification.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.releve.planification.PK.PlanningPK;

@Entity
@Table(name = "gt_planning_rf")
public class Planning {

	@EmbeddedId
	private PlanningPK planningPK;

	@Column(name = "etat_planning")
	private char etat_planning;
	
	@Column(name = "d_debut")
	@Temporal(value = TemporalType.DATE)
	private Date dateDebut;
	
	@Column(name = "d_fin")
	@Temporal(value = TemporalType.DATE)
	private Date dateFin;
	
	@Column(name = "obs_planning")
	private String observation;
	
	@Column(name="dateChargement")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date dateChargement;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="mtr_resp")
	private ResponsableZone responsableZone;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="mtr_agent")
	private Releveur releveur;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = " ref_tournee", insertable = false, updatable = false)
	private Tournee tournee;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fac_prod",insertable=false,updatable=false)
	private Produit produit;

	public PlanningPK getPlanningPK() {
		return planningPK;
	}

	public void setPlanningPK(PlanningPK planningPK) {
		this.planningPK = planningPK;
	}

	public char getEtat_planning() {
		return etat_planning;
	}

	public void setEtat_planning(char etat_planning) {
		this.etat_planning = etat_planning;
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

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public ResponsableZone getResponsableZone() {
		return responsableZone;
	}

	public void setResponsableZone(ResponsableZone responsableZone) {
		this.responsableZone = responsableZone;
	}

	public Releveur getReleveur() {
		return releveur;
	}

	public void setReleveur(Releveur releveur) {
		this.releveur = releveur;
	}

	public Tournee getTournee() {
		return tournee;
	}

	public void setTournee(Tournee tournee) {
		this.tournee = tournee;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Date getDateChargement() {
		return dateChargement;
	}

	public void setDateChargement(Date dateChargement) {
		this.dateChargement = dateChargement;
	}

}
