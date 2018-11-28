package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "gt_zones_rf")
@Entity
public class Zone {
	// Manque de generated value voir la bd mm chose pour le lot
	@Id
	@Column(name = "zone_num")
	private int numero;
	@Column(name = "desc_zone")
	private String description;

	// bi-directional one-to-one association to ResponsableZone
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="mtr_agent")
	private ResponsableZone responsableZone;

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ref_dlg")
	private Delegation delegation;*/

	public Zone() {

	}

	public Zone(int numero, String description, ResponsableZone responsableZone) {
		this.numero = numero;
		this.description = description;
		this.responsableZone = responsableZone;
		//this.delegation = delegation;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ResponsableZone getResponsableZone() {
		return responsableZone;
	}

	public void setResponsableZone(ResponsableZone responsableZone) {
		this.responsableZone = responsableZone;
	}

	/*public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}*/

}
