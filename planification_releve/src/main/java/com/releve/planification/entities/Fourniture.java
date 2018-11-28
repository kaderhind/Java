package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fournitur")
public class Fourniture {
	@Id
	@Column(name="frn_cod")
	private char code;
	@Column(name="frn_lib")
	private String libelle;
	@Column(name="met_cod")
	private char met_cod;
	
	public Fourniture(){
		
	}
	public Fourniture(char code, String libelle, char met_cod) {
		this.code = code;
		this.libelle = libelle;
		this.met_cod = met_cod;
	}
	public char getCode() {
		return code;
	}
	public void setCode(char code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public char getMet_cod() {
		return met_cod;
	}
	public void setMet_cod(char met_cod) {
		this.met_cod = met_cod;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + met_cod;
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
		Fourniture other = (Fourniture) obj;
		if (code != other.code)
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (met_cod != other.met_cod)
			return false;
		return true;
	}
	
}
