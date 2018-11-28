package com.releve.planification.services;

import java.util.Date;

public interface TourneeSuivieService {

	public int getNbIndexLus(int refTournee);
	public int getNbIndexNonLus(int refTournee);
	public int getNbIndex(int ref);
	public Date getDateChegement(int ref);
	public Date getDateDechargement(int ref);
	
}
