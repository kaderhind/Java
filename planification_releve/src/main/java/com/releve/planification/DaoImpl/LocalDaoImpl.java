package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.releve.planification.entities.Local;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.LocalDao;
import com.releve.planification.entities.Delegation;

@Repository
@Transactional
public class LocalDaoImpl implements LocalDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void AddLocal(Local local) {
		entityManager.persist(local);
		
	}

	@Override
	public Local getLocalByID(int id) {
		Local local=entityManager.find(Local.class, id);
		return local;
		
	}

	@Override
	public List<Local> getAllLocalsByDelegation(Delegation delegation) {
		List<Local>locals=entityManager.createQuery("from Local a where a.delegation=:delegation",Local.class).setParameter("delegation", delegation).getResultList();
		return locals;
	}

}
