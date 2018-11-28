package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Releveur;

public interface ReleveurService {
	public List<Releveur> getAllReleveurs();
	
	public void AddReleveur(Releveur releveur);
	public Releveur getReleveurById(int matricule);
	
}
