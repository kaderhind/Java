package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.DelegationDao;
import com.releve.planification.entities.Delegation;

@Repository
@Transactional
public class DelegationDaoImpl implements DelegationDao {

	@PersistenceContext(unitName = "entityManager")
	private EntityManager manager;

	@Override
	public List<Delegation> delegations() {
		List<Delegation> delegations = manager.createQuery("select a from Delegation a", Delegation.class)
				.getResultList();
		return delegations;

	}

	@Override
	public Delegation getDelegationById(int id) {

		Delegation delegation=manager.find(Delegation.class, id);
		return delegation;
	}

	@Override
	public void AddDelegation(Delegation delegation) {
		manager.persist(delegation);

	}
}
