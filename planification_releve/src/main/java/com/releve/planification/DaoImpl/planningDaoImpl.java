package com.releve.planification.DaoImpl;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.PlanningDao;
import com.releve.planification.entities.Planning;
import com.releve.planification.entities.Produit;
import com.releve.planification.entities.Tournee;

@Repository
@Transactional
public class planningDaoImpl implements PlanningDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void AddPlanning(Planning planning) {
		Planning planning2=entityManager.find(Planning.class, planning.getPlanningPK());
		if(planning2 ==null)
			entityManager.persist(planning);
		else{
			planning2.setDateDebut(planning.getDateDebut());
			planning2.setDateFin(planning.getDateFin());
			planning2.setReleveur(planning.getReleveur());
		}
		//entityManager.merge(planning);
	}

	@Override
	public Planning getPlanningByProduitAndTournees(Tournee tournee, Produit produit) {
		Planning planning = entityManager
				.createQuery("from Planning p where p.tournee =:t and p.produit =:p", Planning.class)
				.setParameter("t", tournee).setParameter("p", produit).getSingleResult();
		return planning;
	}

	@Override
	public Planning getPlanning(int reference, int fac_prod) {
		Planning planning;
		try {
			planning = entityManager
					.createQuery("from Planning p where p.planningPK.reference = :r and p.planningPK.fac_prod=:f",
							Planning.class)
					.setParameter("r", reference).setParameter("f", fac_prod).getSingleResult();
		} catch (javax.persistence.NoResultException e) {
			return null;
		}
		return planning;
	}

	@Override
	public void AddDateChargement(Date date,int fac_prod,int ref_tournee) {
	
		try{
			Planning planning = entityManager
					.createQuery("from Planning p where p.planningPK.reference = :r and p.planningPK.fac_prod=:f",
							Planning.class)
					.setParameter("r", ref_tournee).setParameter("f", fac_prod).getSingleResult();
			
			if(planning !=null)
			{
				planning.setDateChargement(date);
				System.out.println("cooc je suis dans update");
			}
			
		}catch(javax.persistence.NoResultException e){
			System.out.println("non planning was found for this tournee");
		}
		
	}

	@Override
	public Date getDateChargement(int ref_tournee, int fac_prod) {
		Planning planning = entityManager.createQuery("from Planning p where p.planningPK.reference = :r and p.planningPK.fac_prod=:f ",Planning.class)
											.setParameter("r", ref_tournee).setParameter("f", fac_prod).getSingleResult();
		if(planning !=null) return planning.getDateChargement();
		return null;
	}

}
