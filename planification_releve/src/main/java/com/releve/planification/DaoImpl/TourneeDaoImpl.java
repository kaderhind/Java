package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.TourneeDao;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.Zone;
import com.releve.planification.entities.Zoning;

@Repository
@Transactional
public class TourneeDaoImpl implements TourneeDao{
	@PersistenceContext
	EntityManager entityManager;
	
	public void AddTournee(Tournee tournee){
		entityManager.persist(tournee);
	}

	@Override
	public List<Tournee> getTourneeByLot(Lot lot) {
		List<Tournee> tournees=entityManager.createQuery("from Tournee a where a.lot= :t",Tournee.class).setParameter("t", lot).getResultList();
				return tournees;
	}

	@Override
	public List<Tournee> getTourneeByLotAndZone(Lot lot, Zone zone) {
		
		List<Tournee> tournees=entityManager.createQuery("from Tournee a where a.lot= :l and a.zone=:z",Tournee.class)
														.setParameter("l", lot)
														.setParameter("z", zone)
														.getResultList();
		return tournees;
	}

	@Override
	public List<Tournee> getTourneeByLotZoneAndZoning(Lot lot, Zone zone, Zoning zoning) {
		List<Tournee> tournees=entityManager.createQuery("from Tournee a where a.lot= :l and a.zone=:z and zoning= :zo",Tournee.class)
				.setParameter("l", lot)
				.setParameter("z", zone)
				.setParameter("zo", zoning)
				.getResultList();
return tournees;
	
	}

	@Override
	public Tournee getTourneeByReference(int ref) {
		Tournee tournee=entityManager.find(Tournee.class, ref);
		return tournee;
	}

	@Override
	public List<Tournee> getTourneeByLotandRespZone(Lot lot, ResponsableZone responsableZone) {
		List<Tournee> tournees=entityManager.createQuery("from Tournee t where t.lot = :l and t.zone.responsableZone =:r",Tournee.class)
													.setParameter("l", lot)
													.setParameter("r", responsableZone).getResultList();
		return tournees;
	}

	@Override
	public List<Tournee> getTourneeByLotandRespZoneandZoning(Lot lot, ResponsableZone responsableZone, int zoning) {
		List<Tournee> tournees=entityManager.createQuery("from Tournee t where t.lot = :l and t.zone.responsableZone =:r and t.zoning.id= :z",Tournee.class)
				.setParameter("l", lot)
				.setParameter("r", responsableZone)
				.setParameter("z", zoning)
				.getResultList();
		return tournees;
	}

}
