package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ZoneDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Zone;

@Repository
@Transactional
public class ZoneDaoImpl implements ZoneDao{
	
	@PersistenceContext(unitName = "entityManager")
	EntityManager entityManager;

	@Override
	public void AddZone(Zone zone) {
		entityManager.persist(zone);
		
	}

	@Override
	public Zone getZoneById(int num) {
		Zone zone= entityManager.find(Zone.class, num);
		return zone;
	}

	@Override
	public List<Zone> getAllZones() {
		List<Zone> zones=entityManager.createQuery("select from Zone",Zone.class).getResultList();
		return zones;
	}

	@Override
	public Zone GetZoneByDelegation(Delegation delegation) {
		Zone zone=(Zone) entityManager.createQuery(" from Zone z where z.delegation=:x").setParameter("x", 	delegation);
		return zone;
	}

	@Override
	public List<Zone> getZoneByResponsableZone(ResponsableZone responsableZone) {
		List<Zone> zones=entityManager.createQuery("from Zone z where z.responsableZone = :r",Zone.class)
							.setParameter("r", responsableZone).getResultList();
				
		return zones;
	}

}
