package com.releve.planification.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RefgeoPK implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name="frn_cod",insertable=false,updatable=false)
	private char frn_cod;
	@Column(name="ref_sec",nullable=false)
	private int ref_sec;
	@Column(name="ref_trn")
	private int ref_trn;
	@Column(name="ref_ord")
	private int ref_ord;
	

	public RefgeoPK(){
		
	}
	
	public RefgeoPK(char frn_cod, int ref_sec, int ref_trn, int ref_ord) {
		this.frn_cod = frn_cod;
		this.ref_sec = ref_sec;
		this.ref_trn = ref_trn;
		this.ref_ord = ref_ord;
	}

	public char getFrn_cod() {
		return frn_cod;
	}
	public void setFrn_cod(char frn_cod) {
		this.frn_cod = frn_cod;
	}
	public int getRef_sec() {
		return ref_sec;
	}
	public void setRef_sec(int ref_sec) {
		this.ref_sec = ref_sec;
	}
	public int getRef_trn() {
		return ref_trn;
	}
	public void setRef_trn(int ref_trn) {
		this.ref_trn = ref_trn;
	}
	public int getRef_ord() {
		return ref_ord;
	}
	public void setRef_ord(int ref_ord) {
		this.ref_ord = ref_ord;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + frn_cod;
		result = prime * result + ref_ord;
		result = prime * result + ref_sec;
		result = prime * result + ref_trn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RefgeoPK other = (RefgeoPK) obj;
		if (frn_cod != other.frn_cod)
			return false;
		if (ref_ord != other.ref_ord)
			return false;
		if (ref_sec != other.ref_sec)
			return false;
		if (ref_trn != other.ref_trn)
			return false;
		return true;
	}
	
	

}
