package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.entities.Lot;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.Zone;
import com.releve.planification.entities.Zoning;

public interface TourneeDao {

	public void AddTournee(Tournee tournee);
	public List<Tournee>getTourneeByLot(Lot  lot);
	public List<Tournee>getTourneeByLotAndZone(Lot lot, Zone zone);
	public List<Tournee> getTourneeByLotZoneAndZoning(Lot lot,Zone zone,Zoning zoning);
	public Tournee getTourneeByReference(int ref);
	public List<Tournee> getTourneeByLotandRespZone(Lot lot,ResponsableZone responsableZone);
	public List<Tournee> getTourneeByLotandRespZoneandZoning(Lot lot, ResponsableZone responsableZone, int zoning);

}
