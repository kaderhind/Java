package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.FournitureDao;
import com.releve.planification.entities.Fourniture;

@Repository
@Transactional
public class FournitureDaoImp implements FournitureDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void AddFourniture(Fourniture fourniture) {
			entityManager.persist(fourniture);
	}

	@Override
	public Fourniture getFournitureById(char id) {
		Fourniture fourniture=entityManager.find(Fourniture.class, id);
		return fourniture;
	}

	@Override
	public List<Fourniture> getAllFourniture() {
		List<Fourniture> fournitures=entityManager.createQuery("from Fourniture",Fourniture.class).getResultList();
		return fournitures;
	}

}
