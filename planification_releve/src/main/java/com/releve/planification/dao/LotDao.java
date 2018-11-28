package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.PK.LotPK;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;

public interface LotDao {

	public void AddLot(Lot lot );
	public Lot getLotById(LotPK lotPK);
	public List<Lot>  getAllLotsByDelegation(Delegation delegation);
	public List<Lot> getAllLots();
	public List<Lot> getLotByTypeClientAndDelegation(char type,int ref_delg);
	
}
