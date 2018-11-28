package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.TourneePlaning;

public interface TourneePlaningService {
	public List<TourneePlaning> getTourneesPlaningLastProduct(List<Tournee> tournees,int fac_prod);
	public void savePlaningTournees(List<TourneePlaning> tourneePlanings,ResponsableZone responsableZone);
	public  List<TourneePlaning>getTourneePlaningCurrentProduct(List<Tournee> tournee,int fac_prof);
}
