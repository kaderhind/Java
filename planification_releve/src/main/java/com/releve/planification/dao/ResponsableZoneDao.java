package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.entities.ResponsableZone;

public interface ResponsableZoneDao {
	public void AddResponsableZone(ResponsableZone responsableZone);
	public List<ResponsableZone> getAllResponsableZone();
	public ResponsableZone getReponsableZoneById(int id);
	public ResponsableZone login(int matricule, String password);
}
