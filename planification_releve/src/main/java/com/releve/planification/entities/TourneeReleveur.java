package com.releve.planification.entities;

import java.util.ArrayList;
import java.util.List;

public class TourneeReleveur {

	private List<Tournee> tournee;
	private List<Releveur> releveur;
	public TourneeReleveur(){
		tournee=new ArrayList<Tournee>();
		releveur=new ArrayList<Releveur>();
	}
	public List<Tournee> getTournee() {
		return tournee;
	}
	public void setTournee(List<Tournee> tournee) {
		this.tournee = tournee;
	}
	public List<Releveur> getReleveur() {
		return releveur;
	}
	public void setReleveur(List<Releveur> releveur) {
		this.releveur = releveur;
	}
}
