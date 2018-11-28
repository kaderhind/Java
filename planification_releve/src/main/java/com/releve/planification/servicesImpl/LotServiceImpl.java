package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.PK.LotPK;
import com.releve.planification.dao.LotDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;
import com.releve.planification.services.LotService;

@Service
public class LotServiceImpl implements LotService {

	@Autowired
     LotDao lotDao;
	@Override
	public void AddLot(Lot lot) {
		lotDao.AddLot(lot);
	}

	@Override
	public Lot getLotById(LotPK lotPK) {
		return lotDao.getLotById(lotPK);
	}

	@Override
	public List<Lot> getAllLotsByDelegation(Delegation delegation) {
		return lotDao.getAllLotsByDelegation(delegation);
	}

	@Override
	public List<Lot> getAllLots() {
		return lotDao.getAllLots();
	}

	@Override
	public List<Lot> getLotByTypeClientAndDelegation(char type,int ref_delg) {
		return lotDao.getLotByTypeClientAndDelegation( type, ref_delg);
	}
	

}
