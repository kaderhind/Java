package com.releve.planification.dao;



import java.util.Date;
import java.util.List;

import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.Produit;

public interface ProduitDao {

	public void AddProduit(Produit produit);
	public Produit getProduitByDelegation(Delegation delegation);
	public Produit getProduitByDelegationAndLot(Delegation delegation, Lot lot);
	public List<Produit> getAllPoduits();
	public Produit getProduitByDate(Date dateDebut,Date dateFin);
	public Produit gerProduitByTypeClientandDLG(int ref_dlg,char type_lot);
	public List<Produit> getProduitByLotAndFourniture(Lot lot, char frn_code);
}
 