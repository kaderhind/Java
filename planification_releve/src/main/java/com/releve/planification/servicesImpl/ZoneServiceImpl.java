package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.ZoneDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Zone;
import com.releve.planification.services.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {

	@Autowired
	ZoneDao zoneDao;
	@Override
	public void AddZone(Zone zone) {
		zoneDao.AddZone(zone);
	}

	@Override
	public Zone getZoneById(int num) {
			return zoneDao.getZoneById(num);
		
	}

	@Override
	public List<Zone> getAllZones() {
		
		return zoneDao.getAllZones();
	}

	@Override
	public Zone GetZoneByDelegation(Delegation delegation) {
		return zoneDao.GetZoneByDelegation(delegation);
	}

	@Override
	public List<Zone> getZoneByResponsableZone(ResponsableZone responsableZone) {
		return zoneDao.getZoneByResponsableZone(responsableZone);
	}

}
