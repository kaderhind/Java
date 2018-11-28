package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.PK.RefgeoPK;
import com.releve.planification.dao.RefgeoDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Fourniture;
import com.releve.planification.entities.Local;
import com.releve.planification.entities.Refgeo;
import com.releve.planification.entities.Tournee;
import com.releve.planification.services.RefgeoService;

@Service
public class RefgeoServiceImpl implements RefgeoService {
	
	@Autowired
	RefgeoDao refgeoDao;

	@Override
	public void AddRefgeo(Refgeo refgeo) {
			refgeoDao.AddRefgeo(refgeo);
	}

	@Override
	public Refgeo getRefgeoByPk(RefgeoPK refgeoPK) {
		Refgeo refgeo=refgeoDao.getRefgeoByPk(refgeoPK);
		return refgeo;
	}

	@Override
	public List<Refgeo> getRefgeoByDelegation(Delegation delegation) {
		return refgeoDao.getRefgeoByDelegation(delegation);
	}

	@Override
	public Refgeo getRefgeoByLocalAndFourniture(Local local, Fourniture fourniture) {
		return refgeoDao.getRefgeoByLocalAndFourniture(local, fourniture);
	}

	@Override
	public List<Refgeo> getRefgeoByTournee(Tournee tournee) {
		
		return refgeoDao.getRefgeoByTournee(tournee);
	}

	
}
