package com.releve.planification.dao;

import java.util.Date;
import java.util.List;

import com.releve.planification.entities.PdaTournee;

public interface PdaTourneeDao {
	public List<PdaTournee> getPdaTourneeByReleveur(int mtr_releveur);
	public void AddPdaTournee(PdaTournee pdatournee);
	public Long getNbIndexLus(int ref,int produit);
	public Long getNbIndexNonLus(int ref,int produit);
	public Long getNbIndex(int ref,int produit);
	public Date getDateDechargement(int ref, int produit);
	
}
