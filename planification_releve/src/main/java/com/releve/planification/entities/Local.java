package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "locaux")
public class Local {

	@Id
	@Column(name = "loc_id")
	private int id;

	@Column(name = "rap_id")
	private int rap_id;

	@Column(name = "ref_num")
	private int numero;
	
	@Column(name = "ref_nbis")
	private char nbis;
	
	@Column(name = "rue_cod")
	private int rueCode;
	
	@Column(name = "ref_esc")
	private String ref_escalier;
	
	@Column(name = "ref_etag")
	private String etage;
	
	@Column(name = "ref_appt")
	private String ref_appt;
	
	@Column(name = "cod_post")
	private int codePostal;
	
	@Column(name = "ilot_num")
	private int ilot_num;
	
	@Column(name = "ref_adr")
	private String adress;
	
	@Column(name = "ref_comp")
	private String ref_comp;
	
	
	@Column(name = "trn_enc")
	private int trn_enc;
	
	@Column(name = "par_enc")
	private int par_enc;
	
	@Column(name = "ord_enc")
	private int ord_enc;
	
	// Bidirectional association to Delegation
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name = "ref_dlg")
		Delegation delegation;
		
		@JsonManagedReference
		@OneToOne(fetch=FetchType.EAGER,mappedBy="local")
		private Contrat contrat;
		
	

	public Local() {

	}

	public Local(int id, Delegation delegation, int trn_enc, int par_enc, int ord_enc) {
		this.id = id;
		this.delegation = delegation;
		this.trn_enc = trn_enc;
		this.par_enc = par_enc;
		this.ord_enc = ord_enc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

	public int getTrn_enc() {
		return trn_enc;
	}

	public void setTrn_enc(int trn_enc) {
		this.trn_enc = trn_enc;
	}

	public int getPar_enc() {
		return par_enc;
	}

	public void setPar_enc(int par_enc) {
		this.par_enc = par_enc;
	}

	public int getOrd_enc() {
		return ord_enc;
	}

	public void setOrd_enc(int ord_enc) {
		this.ord_enc = ord_enc;
	}

	public int getRap_id() {
		return rap_id;
	}

	public void setRap_id(int rap_id) {
		this.rap_id = rap_id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getNbis() {
		return nbis;
	}

	public void setNbis(char nbis) {
		this.nbis = nbis;
	}

	public int getRueCode() {
		return rueCode;
	}

	public void setRueCode(int rueCode) {
		this.rueCode = rueCode;
	}

	public String getRef_escalier() {
		return ref_escalier;
	}

	public void setRef_escalier(String ref_escalier) {
		this.ref_escalier = ref_escalier;
	}

	public String getEtage() {
		return etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}

	public String getRef_appt() {
		return ref_appt;
	}

	public void setRef_appt(String ref_appt) {
		this.ref_appt = ref_appt;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public int getIlot_num() {
		return ilot_num;
	}

	public void setIlot_num(int ilot_num) {
		this.ilot_num = ilot_num;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getRef_comp() {
		return ref_comp;
	}

	public void setRef_comp(String ref_comp) {
		this.ref_comp = ref_comp;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	

}
