package com.releve.planification.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.releve.planification.PK.RefgeoPK;

@Entity
@Table(name="refgeo")
public class Refgeo {
	@EmbeddedId
	private RefgeoPK refgeoPK;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="frn_cod",insertable=false,updatable=false,nullable=false)
	Fourniture fourniture;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ref_dlg")
	Delegation delegation;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="loc_id")
	Local local;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ref_tournee")
	Tournee tournee;

	@Column(name="cpt_coef")
	private int cpt_coef;
	
	@Column(name="pol_typc")
	private char pol_typc;
	@Column(name="cpt_num")
	private String cpt_num;
	
	@Column(name="rlv_nidx")
	private int rlv_nidx;
	@Column(name="rlv_date")
	private Date rlv_date;
	
	public int getRlv_nidx() {
		return rlv_nidx;
	}

	public void setRlv_nidx(int rlv_nidx) {
		this.rlv_nidx = rlv_nidx;
	}

	public Date getRlv_date() {
		return rlv_date;
	}

	public void setRlv_date(Date rlv_date) {
		this.rlv_date = rlv_date;
	}

	public Refgeo(){
		
	}
	
	public Refgeo(RefgeoPK refgeoPK, Fourniture fourniture, Delegation delegation, Local local) {
		this.refgeoPK = refgeoPK;
		this.fourniture = fourniture;
		this.delegation = delegation;
		this.local = local;
	}

	public RefgeoPK getRefgeoPK() {
		return refgeoPK;
	}

	public void setRefgeoPK(RefgeoPK refgeoPK) {
		this.refgeoPK = refgeoPK;
	}

	public Fourniture getFourniture() {
		return fourniture;
	}

	public void setFourniture(Fourniture fourniture) {
		this.fourniture = fourniture;
	}

	public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public Tournee getTournee() {
		return tournee;
	}

	public void setTournee(Tournee tournee) {
		this.tournee = tournee;
	}

	public int getCpt_coef() {
		return cpt_coef;
	}

	public void setCpt_coef(int cpt_coef) {
		this.cpt_coef = cpt_coef;
	}

	public char getPol_typc() {
		return pol_typc;
	}

	public void setPol_typc(char pol_typc) {
		this.pol_typc = pol_typc;
	}

	public String getCpt_num() {
		return cpt_num;
	}

	public void setCpt_num(String cpt_num) {
		this.cpt_num = cpt_num;
	}

	
}
