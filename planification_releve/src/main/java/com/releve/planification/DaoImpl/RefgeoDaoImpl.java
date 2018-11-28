package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.PK.RefgeoPK;
import com.releve.planification.dao.RefgeoDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Fourniture;
import com.releve.planification.entities.Local;
import com.releve.planification.entities.Refgeo;
import com.releve.planification.entities.Tournee;

@Repository
@Transactional
public class RefgeoDaoImpl implements RefgeoDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void AddRefgeo(Refgeo refgeo) {
		entityManager.persist(refgeo);
	}

	@Override
	public Refgeo getRefgeoByPk(RefgeoPK refgeoPK) {
		Refgeo refgeo=entityManager.find(Refgeo.class, refgeoPK);
		return refgeo;
	}

	@Override
	public List<Refgeo> getRefgeoByDelegation(Delegation delegation) {
		List<Refgeo> refgeos=entityManager.createQuery("from Refgeo r where r.delegation=:delegation",Refgeo.class).setParameter("delegation", delegation).getResultList();
		return refgeos;
	}

	@Override
	public Refgeo getRefgeoByLocalAndFourniture(Local local, Fourniture fourniture) {
		Refgeo refgeo=entityManager.createQuery("from Refgeo r where r.local=:l and r.fourniture=:f",Refgeo.class)
									.setParameter("l", local)
									.setParameter("f", fourniture)
									.getSingleResult();
									
		return refgeo;
	}

	@Override
	public List<Refgeo> getRefgeoByTournee(Tournee tournee) {
		List<Refgeo> refgeos=entityManager.createQuery("from Refgeo r where r.tournee = :t",Refgeo.class)
												.setParameter("t", tournee).getResultList();
		return refgeos;
	}


}
