package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {

	@Id
	@Column(name = "cli_id")
	private int id;
	@Column(name = "cli_tid")
	private char t_id;
	@Column(name = "cli_cin")
	private String cin;
	@Column(name = "cli_titre")
	private String titre;
	@Column(name = "cli_sigl")
	private String sigle;
	@Column(name = "cli_nom")
	private String nom;

	public Client(){
		
	}
	
	public Client(int id, char t_id, String cin, String titre, String sigle, String nom) {
		
		this.id = id;
		this.t_id = t_id;
		this.cin = cin;
		this.titre = titre;
		this.sigle = sigle;
		this.nom = nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getT_id() {
		return t_id;
	}

	public void setT_id(char t_id) {
		this.t_id = t_id;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cin == null) ? 0 : cin.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((sigle == null) ? 0 : sigle.hashCode());
		result = prime * result + t_id;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		Client other = (Client) obj;
		if (cin == null) {
			if (other.cin != null)
				return false;
		} else if (!cin.equals(other.cin))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (sigle == null) {
			if (other.sigle != null)
				return false;
		} else if (!sigle.equals(other.sigle))
			return false;
		if (t_id != other.t_id)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", t_id=" + t_id + ", cin=" + cin + ", titre=" + titre + ", sigle=" + sigle
				+ ", nom=" + nom + "]";
	}

}
