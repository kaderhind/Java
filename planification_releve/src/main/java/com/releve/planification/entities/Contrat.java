package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.log4j.varia.FallbackErrorHandler;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.releve.planification.PK.ContratPK;

@Entity
@Table(name="polices")
public class Contrat {

	@EmbeddedId
	private ContratPK contratPK;
	
	//Bidirectional association to Local
//	@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="loc_id")
//	private Local local;
//	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="cli_id")
	private Client client;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ref_dlg")
	private Delegation delegation;
	

	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="ref_sec",referencedColumnName="ref_sec"),
		@JoinColumn(name="ref_trn",referencedColumnName="ref_trn"),
		@JoinColumn(name="ref_ord",referencedColumnName="ref_ord"),
		@JoinColumn(name="frn_cod",referencedColumnName="frn_cod")
	})
	private Refgeo refgeo;
	
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="frn_cod",insertable=false,updatable=false)
//	Fourniture fourniture;
	
	@JsonBackReference
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="loc_id")
	private Local local;
	
//	public Fourniture getFourniture() {
//		return fourniture;
//	}
//
//	public void setFourniture(Fourniture fourniture) {
//		this.fourniture = fourniture;
//	}

	@Column(name="trf_cod")
	private char trf_cod;
	@Column(name="enc_cod")
	private int enc_cod;
	@Column(name="pol_etat")
	private char pol_etat;
	@Column(name="pol_clas")
	private char pol_clas;
	
	public Contrat(){
		
	}

	public ContratPK getContratPK() {
		return contratPK;
	}

	public void setContratPK(ContratPK contratPK) {
		this.contratPK = contratPK;
	}

//	public Local getLocal() {
//		return local;
//	}
//
//	public void setLocal(Local local) {
//		this.local = local;
//	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

	public Refgeo getRefgeo() {
		return refgeo;
	}

	public void setRefgeo(Refgeo refgeo) {
		this.refgeo = refgeo;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public char getTrf_cod() {
		return trf_cod;
	}

	public void setTrf_cod(char trf_cod) {
		this.trf_cod = trf_cod;
	}

	public int getEnc_cod() {
		return enc_cod;
	}

	public void setEnc_cod(int enc_cod) {
		this.enc_cod = enc_cod;
	}

	public char getPol_etat() {
		return pol_etat;
	}

	public void setPol_etat(char pol_etat) {
		this.pol_etat = pol_etat;
	}

	public char getPol_clas() {
		return pol_clas;
	}

	public void setPol_clas(char pol_clas) {
		this.pol_clas = pol_clas;
	}	
	
}
