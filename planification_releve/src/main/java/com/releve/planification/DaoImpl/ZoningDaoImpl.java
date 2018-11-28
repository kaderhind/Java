package com.releve.planification.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ZoningDao;
import com.releve.planification.entities.Zoning;

@Repository
@Transactional
public class ZoningDaoImpl implements ZoningDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Zoning getZoning(int n) {
	Zoning zoning=entityManager.find(Zoning.class, n);
		return zoning;
	}
	

}
