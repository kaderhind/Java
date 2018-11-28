package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pda_anomalies")
public class Anomalie {

	@Id
	@Column(name="cd_anomalie")
	private int code_anomalie;
	
	@Column(name="lib_anomalie")
	private String libelle;
	@Column(name="type_anomalie")
	private int type_anomalie;
	@Column(name="cd_traitement")
	private int cd_traitement;
	public int getCode_anomalie() {
		return code_anomalie;
	}
	public void setCode_anomalie(int code_anomalie) {
		this.code_anomalie = code_anomalie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getType_anomalie() {
		return type_anomalie;
	}
	public void setType_anomalie(int type_anomalie) {
		this.type_anomalie = type_anomalie;
	}
	public int getCd_traitement() {
		return cd_traitement;
	}
	public void setCd_traitement(int cd_traitement) {
		this.cd_traitement = cd_traitement;
	}
	
}
