package com.releve.planification.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LotPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "lot_num", insertable = false, updatable = false)
	private int numero;

	@Column(name = "pol_type", insertable = false, updatable = false)
	private char type;
	@Column(name = "ref_dlg", insertable = false, updatable = false)
	private int ref_dlg;

	public void LotPk() {

	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public int getRef_dlg() {
		return ref_dlg;
	}

	public void setRef_dlg(int ref_dlg) {
		this.ref_dlg = ref_dlg;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		result = prime * result + ref_dlg;
		result = prime * result + type;
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
		LotPK other = (LotPK) obj;
		if (numero != other.numero)
			return false;
		if (ref_dlg != other.ref_dlg)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

}
