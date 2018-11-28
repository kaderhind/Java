package com.releve.planification.services;

import java.util.Date;

import com.releve.planification.entities.Planning;
import com.releve.planification.entities.Produit;
import com.releve.planification.entities.Tournee;

public interface PlanningService {
	public void AddPlanning(Planning planning);
	public Planning getPlanningByProduitAndTournees(Tournee tournee,Produit produit);
	public Planning getPlanning(int reference, int fac_prod);
	public void AddDateChargement(Date date,int fac_prod,int ref_tournee);
	public Date getDateChargement(int ref_tournee, int fac_prod) ;
}
