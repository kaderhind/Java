package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Zone;

public interface ZoneService {
	public void AddZone(Zone zone);
	public Zone getZoneById(int num);
	public List<Zone>  getAllZones();
	public Zone GetZoneByDelegation(Delegation delegation);
	public List<Zone> getZoneByResponsableZone(ResponsableZone responsableZone);

}
