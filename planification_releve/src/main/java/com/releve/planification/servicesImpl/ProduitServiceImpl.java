package com.releve.planification.servicesImpl;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.ProduitDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.Produit;
import com.releve.planification.services.ProduitService;

@Service
public class ProduitServiceImpl implements ProduitService{

	@Autowired
	ProduitDao produitDao;
	@Override
	public void AddProduit(Produit produit) {
			produitDao.AddProduit(produit);
	}

	@Override
	public Produit getProduitByDelegation(Delegation delegation) {
		return produitDao.getProduitByDelegation(delegation);
	}

	@Override
	public Produit getProduitByDelegationAndLot(Delegation delegation, Lot lot) {
		return produitDao.getProduitByDelegationAndLot(delegation, lot);
	}

	

	@Override
	public List<Produit> getAllPoduits() {
		
		return produitDao.getAllPoduits();
	}

	@Override
	public Produit getProduitByDate(Date dateDebut, Date dateFin) {
		
		return produitDao.getProduitByDate(dateDebut, dateFin);
	}

	@Override
	public Produit gerProduitByTypeClientandDLG(int ref_dlg, char type_lot) {
		return produitDao.gerProduitByTypeClientandDLG(ref_dlg, type_lot);
	}

	@Override
	public List<Produit> getProduitByLotAndFourniture(Lot lot, char frn_code) {
		return produitDao.getProduitByLotAndFourniture(lot, frn_code);
	}

}
