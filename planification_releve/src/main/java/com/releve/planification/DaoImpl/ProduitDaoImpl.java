package com.releve.planification.DaoImpl;



import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ProduitDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.Produit;

@Repository
@Transactional
public class ProduitDaoImpl  implements ProduitDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public void AddProduit(Produit produit) {
			entityManager.persist(produit);
	}

	@Override
	public Produit getProduitByDelegation(Delegation delegation) {
	 Produit produit=entityManager.createQuery("from Produit p where p.delegation =:d",Produit.class)
			 .setParameter("d", delegation).getSingleResult();
	 return produit;
	}

	@Override
	public Produit getProduitByDelegationAndLot(Delegation delegation, Lot lot) {
		Produit produit=entityManager.createQuery("from Produit p where p.delegation =: d and p.lot =: l",Produit.class)
										.setParameter("d", delegation)
										.setParameter("l", lot)
										.getSingleResult();
		return produit;
	}

	

	@Override
	public List<Produit> getAllPoduits() {
		List<Produit> produits=entityManager.createQuery("from Produit",Produit.class).getResultList();
		return produits;
	}

	@Override
	public Produit getProduitByDate(Date dateDebut, Date dateFin) {
		Produit produit=entityManager.createQuery("from Produit p where p.dateDebut = :dd and p. dateFin= :df",Produit.class)
				.setParameter("dd", dateDebut).setParameter("df", dateFin)
				.getSingleResult();
		return produit;
	}

	@Override
	public Produit gerProduitByTypeClientandDLG(int ref_dlg, char type_lot) {
		try{
			Produit produit=entityManager.createQuery(" from Produit p where p.lot.lotPK.type= :t and p.lot.lotPK.ref_dlg= :d"
					+ " order by(p.dateDebut)",Produit.class)
				.setParameter("t", type_lot)
				.setParameter("d", ref_dlg)
				.getSingleResult();
			return produit;
	
		}catch(javax.persistence.NoResultException e){
			return null;
		}
		
	}

	@Override
	public List<Produit> getProduitByLotAndFourniture(Lot lot, char frn_code) {
		
		List<Produit> produits=entityManager.createQuery("from Produit p where p.lot = :l and p.fourniture.code = :f",Produit.class)
													.setParameter("l", lot)
													.setParameter("f", frn_code)
													.getResultList();
		return produits;
	}


}
