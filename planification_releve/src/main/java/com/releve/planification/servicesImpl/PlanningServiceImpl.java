package com.releve.planification.servicesImpl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.PlanningDao;
import com.releve.planification.entities.Planning;
import com.releve.planification.entities.Produit;
import com.releve.planification.entities.Tournee;
import com.releve.planification.services.PlanningService;

@Service
public class PlanningServiceImpl implements PlanningService{

	@Autowired
	PlanningDao planningDao;
	@Override
	public void AddPlanning(Planning planning) {
		planningDao.AddPlanning(planning);
	}

	@Override
	public Planning getPlanningByProduitAndTournees(Tournee tournee, Produit produit) {
		return planningDao.getPlanningByProduitAndTournees(tournee, produit);
	}

	@Override
	public Planning getPlanning(int reference, int fac_prod) {
		return planningDao.getPlanning(reference, fac_prod);
	}

	@Override
	public void AddDateChargement(Date date,int fac_prod,int ref_tournee) {
			planningDao.AddDateChargement(date,  fac_prod, ref_tournee);
	}

	@Override
	public Date getDateChargement(int ref_tournee, int fac_prod) {
		return planningDao.getDateChargement(ref_tournee, fac_prod);
	}
}
