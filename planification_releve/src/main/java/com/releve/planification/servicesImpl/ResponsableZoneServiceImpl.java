package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.ResponsableZoneDao;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.services.ResponsableZoneService;

@Service
public class ResponsableZoneServiceImpl implements ResponsableZoneService{

	@Autowired
	ResponsableZoneDao responsableZoneDao;
	@Override
	public void addResponsableZone(ResponsableZone responsableZone) {
			responsableZoneDao.AddResponsableZone(responsableZone);
	}

	@Override
	public List<ResponsableZone> getAllResponsableZones() {
		List<ResponsableZone> responsableZones=responsableZoneDao.getAllResponsableZone();
			return responsableZones;
	}

	@Override
	public ResponsableZone getResponsableZone(int matricule) {
		ResponsableZone responsableZone=responsableZoneDao.getReponsableZoneById(matricule);
		return responsableZone;
	}

	@Override
	public ResponsableZone login(int matricule, String password) {
		ResponsableZone responsableZone=responsableZoneDao.login(matricule, password);
		return responsableZone;
	}

}
