package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.DelegationDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.services.DelegationService;

@Service
public class DelegationServiceImpl implements DelegationService{

	@Autowired
	DelegationDao delegationDao;
	@Override
	public List<Delegation> getAllDelegation() {
		return delegationDao.delegations();
	}

	@Override
	public void AddDelegation(Delegation delegation) {
		delegationDao.AddDelegation(delegation);
		
	}

	@Override
	public Delegation getDelagationById(int ref_dlg) {
		Delegation delegation=delegationDao.getDelegationById(ref_dlg);
		return delegation;
	}

}
