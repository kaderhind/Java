package com.releve.planification.DaoImpl;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.PdaTourneeDao;
import com.releve.planification.entities.PdaTournee;

@Repository
@Transactional
public class PdaTourneeDaoImpl implements PdaTourneeDao{

	@PersistenceContext
	EntityManager entityManager;
	@Override
	public List<PdaTournee> getPdaTourneeByReleveur(int mtr_releveur) {
		List<PdaTournee> pdaTournees=entityManager.createQuery("from PdaTournee where PdaTournee.matr_resp = :r",PdaTournee.class)
																.setParameter("r", mtr_releveur).getResultList();
		return pdaTournees;
	}

	@Override
	public void AddPdaTournee(PdaTournee pdatournee) {
		entityManager.persist(pdatournee);
	}

	@Override
	public Long getNbIndexLus(int ref,int produit) {
		Long nbindex=entityManager.createQuery("select count(*) from PdaTournee P where  P.ref_tournee =:r and P.rlv_nidx1 != 0",Long.class)
				.setParameter("r", ref).getSingleResult(); 
		System.out.println("le nombre d index"+nbindex+"la tournee"+ref);
		return nbindex;
	}

	@Override
	public Long getNbIndexNonLus(int ref,int produit) {
		Long nbindex=entityManager.createQuery("select count(*) from PdaTournee P where  P.ref_tournee =:r and P.rlv_nidx1 = 0",Long.class)
				.setParameter("r", ref).getSingleResult(); 
		System.out.println("le nombre d index"+nbindex+"la tournee"+ref);
		return nbindex;
	}

	@Override
	public Long getNbIndex(int ref, int produit) {
		Long nbindex=entityManager.createQuery("select count(*) from PdaTournee P where  P.ref_tournee =:r  and P.rlv_prod =:prod",Long.class)
				.setParameter("r", ref)
				.setParameter("prod", produit)
				.getSingleResult(); 
		System.out.println("le nombre d index"+nbindex+"la tournee"+ref);
		return nbindex;
	}

	@Override
	public Date getDateDechargement(int ref, int produit) {
		Date dateDechargement=(Date) entityManager.createQuery("select P.rlv_ndate1 from PdaTournee P where P.ref_tournee =:r  and P.rlv_prod =:prod  order by P.rlv_ndate1 DESC").setParameter("r", ref)
				.setParameter("prod", produit)
				.setMaxResults(1)
				.getSingleResult(); 
		return dateDechargement;
	}

	
	
	

}
