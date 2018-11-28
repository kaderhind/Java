package com.releve.planification.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gt_agents_rf")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_agent")
public class Agent {

	@Column(name="mtr_agent")
	@Id
	private int matricule;
	@Column(name="nom_agent")
	private String nom;
	
	@Column(name="password")
	private String password;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ref_dlg")
	private Delegation delegation;
	
	
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Delegation getDelegation() {
		return delegation;
	}
	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}
	
}
