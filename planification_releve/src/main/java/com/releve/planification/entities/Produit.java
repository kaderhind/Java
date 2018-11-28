package com.releve.planification.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "produits")
public class Produit {

	@Id
	@Column(name = "fac_prod")
	private int fac_prod;

	@Column(name = "prod_etat")
	private char prod_etat;

	@Column(name = "prod_njc")
	private int prod_njc;

	@Column(name = "datep_drlv")
	@Temporal(value = TemporalType.DATE)
	private Date dateDebut;

	@Column(name = "datep_frlv")
	@Temporal(value = TemporalType.DATE)
	private Date dateFin;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "frn_cod")
	private Fourniture fourniture;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "ref_dlg", referencedColumnName = "ref_dlg"),
			@JoinColumn(name = "lot_num", referencedColumnName = "lot_num"),
			@JoinColumn(name = "pol_type", referencedColumnName = "pol_type") })
	private Lot lot;

	public int getFac_prod() {
		return fac_prod;
	}

	public void setFac_prod(int fac_prod) {
		this.fac_prod = fac_prod;
	}

	public char getProd_etat() {
		return prod_etat;
	}

	public void setProd_etat(char prod_etat) {
		this.prod_etat = prod_etat;
	}

	public int getProd_njc() {
		return prod_njc;
	}

	public void setProd_njc(int prod_njc) {
		this.prod_njc = prod_njc;
	}

	public Fourniture getFourniture() {
		return fourniture;
	}

	public void setFourniture(Fourniture fourniture) {
		this.fourniture = fourniture;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
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

}
