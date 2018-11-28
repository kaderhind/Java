package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ReleveurDao;
import com.releve.planification.entities.Releveur;

@Repository
@Transactional
public class ReleveurDaoImpl implements ReleveurDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Releveur getReleveur(int matricule) {
	
		Releveur releveur=entityManager.find(Releveur.class, matricule);
		return releveur;
	}

	@Override
	public List<Releveur> getAllReleveur() {
		List<Releveur> releveurs = entityManager.createQuery("select a from Releveur a ", Releveur.class).getResultList();
		return releveurs;
	}

	@Override
	public void AddReleveur(Releveur releveur) {
		entityManager.persist(releveur);
	}

	@Override
	public void DeleteReleveur(Releveur releveur) {
		// TODO Auto-generated method stub

	}

}
