package com.releve.planification.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.PK.ContratPK;
import com.releve.planification.dao.ContratDao;
import com.releve.planification.entities.Contrat;

@Repository
@Transactional
public class ContratDaoImpl implements ContratDao {

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void AddContrat(Contrat contrat) {
		entityManager.persist(contrat);
	}

	@Override
	public Contrat getContratByPk(ContratPK contratPK) {
         Contrat contrat=entityManager.find(Contrat.class, contratPK);
		return contrat;
	}

}
