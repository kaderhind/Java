package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.ResponsableZone;

public interface ResponsableZoneService {
	public void addResponsableZone(ResponsableZone responsableZone);
	public List<ResponsableZone> getAllResponsableZones();
	public ResponsableZone getResponsableZone(int matricule);
	public ResponsableZone login(int matricule, String password);

}
