package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.entities.Releveur;

public interface ReleveurDao {

	public Releveur getReleveur(int matricule);
	public List<Releveur> getAllReleveur();
	public void AddReleveur(Releveur releveur);
	public void DeleteReleveur(Releveur releveur);
}
