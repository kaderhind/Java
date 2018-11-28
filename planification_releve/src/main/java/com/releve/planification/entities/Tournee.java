package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "tournees_rlv")
@Entity
public class Tournee {
	@Id
	@Column(name = "ref_tournee")
	private int reference;

	@Column(name = "ref_sec_princ")
	private int ref_sec_princ;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cd_zoning")
	private Zoning zoning;

	// unidirectionel  Association to Lot 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumns({ 
		@JoinColumn(name = "ref_dlg", referencedColumnName="ref_dlg"), 
		@JoinColumn(name = "lot_num",referencedColumnName="lot_num"),
		@JoinColumn(name="pol_type",referencedColumnName="pol_type") 
		})
	private Lot lot;
	
	// unidirectionel  Association to zone
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="zone_num",referencedColumnName="zone_num")	
	private Zone zone;

	public Tournee() {

	}

	public Tournee(int reference, int ref_sec_princ, Zoning zoning, com.releve.planification.entities.Agent agent,
			Lot lot, Zone zone) {

		this.reference = reference;
		this.ref_sec_princ = ref_sec_princ;
		this.zoning = zoning;
		this.lot = lot;
		this.zone = zone;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public int getRef_sec_princ() {
		return ref_sec_princ;
	}

	public void setRef_sec_princ(int ref_sec_princ) {
		this.ref_sec_princ = ref_sec_princ;
	}

	public Zoning getZoning() {
		return zoning;
	}

	public void setZoning(Zoning zoning) {
		this.zoning = zoning;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

	public Zone getZone() {
		return zone;
	}

	public void setZone(Zone zone) {
		this.zone = zone;
	}

}
