package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.PK.LotPK;
import com.releve.planification.dao.LotDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;

@Repository
@Transactional
public class LotDaoImpl implements LotDao {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void AddLot(Lot lot) {
			entityManager.persist(lot);
	}

	

	@Override
	public List<Lot> getAllLotsByDelegation(Delegation delegation) {
    List<Lot> lot=entityManager.createQuery("from Lot where delegation= :x",Lot.class).setParameter("x", delegation).getResultList();
    return lot;
		
	}

	@Override
	public List<Lot> getAllLots() {
		List<Lot> lot=entityManager.createQuery("from Lot",Lot.class).getResultList();
		return lot;
	}

	@Override
	public Lot getLotById(LotPK lotPK) {
		Lot lot=entityManager.find(Lot.class, lotPK);
		return lot;
	}



	@Override
	public List<Lot> getLotByTypeClientAndDelegation(char type,int ref_delg) {
		List<Lot> lots=entityManager.createQuery("from Lot l where l.lotPK.type=:t and l.lotPK.ref_dlg=:d",Lot.class)
				.setParameter("t", type)
				.setParameter("d", ref_delg).getResultList();
		return lots;
	}
	
	

}
