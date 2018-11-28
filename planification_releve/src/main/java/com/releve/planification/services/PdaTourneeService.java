package com.releve.planification.services;

import java.util.Date;
import java.util.List;

import com.releve.planification.entities.PdaTournee;

public interface PdaTourneeService {

	public void AddPdaTournee(PdaTournee pdaTournee);
	public List<PdaTournee> getPdaTournee(int matricule);
	public Long getNbIndexLus(int ref,int produit);
	public Long getNbIndexNonLus(int ref, int produit);
	public Long getNbIndex(int ref, int produit);
	public Date getDateDechargement(int ref, int produit);
}
