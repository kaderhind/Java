package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.TourneeDao;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.Zone;
import com.releve.planification.entities.Zoning;
import com.releve.planification.services.TourneeService;

@Service
public class TourneeServiceImpl implements TourneeService {

	@Autowired
	TourneeDao tourneeDao;

	@Override
	public void AddTournee(Tournee tournee) {
		tourneeDao.AddTournee(tournee);

	}

	@Override
	public List<Tournee> getTourneeByLot(Lot lot) {
		return tourneeDao.getTourneeByLot(lot);
	}

	@Override
	public List<Tournee> getTourneeByLotAndZone(Lot lot, Zone zone) {
		return tourneeDao.getTourneeByLotAndZone(lot, zone);
	}

	@Override
	public List<Tournee> getTourneeByLotZoneAndZoning(Lot lot, Zone zone, Zoning zoning) {
		return tourneeDao.getTourneeByLotZoneAndZoning(lot, zone, zoning);
	}

	@Override
	public Tournee getTourneeByReference(int ref) {
		return tourneeDao.getTourneeByReference(ref);
	}

	@Override
	public List<Tournee> getTourneeByLotandRespZone(Lot lot, ResponsableZone responsableZone) {
		
		return tourneeDao.getTourneeByLotandRespZone(lot, responsableZone);
	}

	@Override
	public List<Tournee> getTourneeByLotandRespZoneandZoning(Lot lot, ResponsableZone responsableZone, int zoning) {
		
		return tourneeDao.getTourneeByLotandRespZoneandZoning(lot, responsableZone, zoning);
	}

}
