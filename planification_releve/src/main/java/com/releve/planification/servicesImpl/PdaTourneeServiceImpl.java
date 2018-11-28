package com.releve.planification.servicesImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.PdaTourneeDao;
import com.releve.planification.entities.PdaTournee;
import com.releve.planification.services.PdaTourneeService;

@Service
public class PdaTourneeServiceImpl implements PdaTourneeService{

	@Autowired
	PdaTourneeDao PdaTourneeDao;
	@Override
	public void AddPdaTournee(PdaTournee pdaTournee) {
		PdaTourneeDao.AddPdaTournee(pdaTournee);
	}

	@Override
	public List<PdaTournee> getPdaTournee(int matricule) {
		return PdaTourneeDao.getPdaTourneeByReleveur(matricule);
	}

	@Override
	public Long getNbIndexLus(int ref, int produit) {
		return PdaTourneeDao.getNbIndexLus(ref, produit);
	}

	@Override
	public Long getNbIndexNonLus(int ref, int produit) {
		
		return PdaTourneeDao.getNbIndexNonLus(ref,produit);
	}

	@Override
	public Long getNbIndex(int ref, int produit) {
		return PdaTourneeDao.getNbIndex(ref, produit);
	}

	@Override
	public Date getDateDechargement(int ref, int produit) {
		return PdaTourneeDao.getDateDechargement(ref, produit);
	}

}
