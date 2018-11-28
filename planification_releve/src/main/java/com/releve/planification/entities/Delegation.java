package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "delegations")
public class Delegation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ref_dlg")
	private int ref_dlg;

	@Column(name = "lib_dlg")
	private String lib_dlg;

	@Column(name = "vil_cod")
	private int vil_cod;

	@Column(name = "tel_fac")
	private int tel_fac;

	@Column(name = "adr_dlg")
	private String adr_dlg;
	
	
	/*@OneToMany(fetch=FetchType.EAGER,mappedBy="delegation")
	@JsonManagedReference
	private List<Lot> lots;*/

	/*@OneToMany(fetch=FetchType.EAGER,mappedBy="delegation")
	private List<Zone> zones;
	

	@OneToMany(fetch=FetchType.EAGER,mappedBy="delegation")
	private List<Local> locals;*/
	public Delegation(){
		
	}
	
	public Delegation(int ref_dlg, String lib_dlg, int vil_cod, int tel_fac, String adr_dlg) {
		this.ref_dlg = ref_dlg;
		this.lib_dlg = lib_dlg;
		this.vil_cod = vil_cod;
		this.tel_fac = tel_fac;
		this.adr_dlg = adr_dlg;
	}

	public int getRef_dlg() {
		return ref_dlg;
	}

	public void setRef_dlg(int ref_dlg) {
		this.ref_dlg = ref_dlg;
	}

	public String getLib_dlg() {
		return lib_dlg;
	}

	public void setLib_dlg(String lib_dlg) {
		this.lib_dlg = lib_dlg;
	}

	public int getVil_cod() {
		return vil_cod;
	}

	public void setVil_cod(int vil_cod) {
		this.vil_cod = vil_cod;
	}

	public int getTel_fac() {
		return tel_fac;
	}

	public void setTel_fac(int tel_fac) {
		this.tel_fac = tel_fac;
	}

	public String getAdr_dlg() {
		return adr_dlg;
	}

	public void setAdr_dlg(String adr_dlg) {
		this.adr_dlg = adr_dlg;
	}

/*	public List<Lot> getLots() {
		return lots;
	}

	public void setLots(List<Lot> lots) {
		this.lots = lots;
	}
	
	/*
	public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}

	public List<Local> getLocals() {
		return locals;
	}

	public void setLocals(List<Local> locals) {
		this.locals = locals;
	}*/


}
