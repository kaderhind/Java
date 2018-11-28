package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.ReleveurDao;
import com.releve.planification.entities.Releveur;
import com.releve.planification.services.ReleveurService;

@Service
public class ReleveurServiceImpl implements ReleveurService {

	@Autowired
	ReleveurDao releveurDao;

	@Override
	public List<Releveur> getAllReleveurs() {
		return releveurDao.getAllReleveur();
	}

	@Override
	public void AddReleveur(Releveur releveur) {
		releveurDao.AddReleveur(releveur);
	}

	@Override
	public Releveur getReleveurById(int matricule) {
		return releveurDao.getReleveur(matricule);

	}

}
