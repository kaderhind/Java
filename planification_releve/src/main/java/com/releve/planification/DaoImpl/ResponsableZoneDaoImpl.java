package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ResponsableZoneDao;
import com.releve.planification.entities.ResponsableZone;

@Repository
@Transactional
public class ResponsableZoneDaoImpl implements ResponsableZoneDao {

	@PersistenceContext(unitName = "entityManager")
	private EntityManager entityManager;

	@Override
	public void AddResponsableZone(ResponsableZone responsableZone) {
		entityManager.persist(responsableZone);
	}

	@Override
	public List<ResponsableZone> getAllResponsableZone() {
		List<ResponsableZone> responsableZones = entityManager.createQuery("select a from ResponsableZone a",ResponsableZone.class).getResultList();
		return responsableZones;
	}

	@Override
	public ResponsableZone getReponsableZoneById(int id) {
		ResponsableZone responsableZone = (ResponsableZone) entityManager.find(ResponsableZone.class, id);
		return responsableZone;
	}

	@Override
	public ResponsableZone login(int matricule, String password) {
		ResponsableZone responsableZone;
		try{
				responsableZone=entityManager.createQuery("select r from ResponsableZone r where r.matricule =:m and r.password =:p",ResponsableZone.class)
																		.setParameter("m", matricule)
																		.setParameter("p", password)
																		.getSingleResult();
		}catch(javax.persistence.NoResultException e){
			return null;
		}
		
		return responsableZone;
	}

}
