package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.releve.planification.entities.Local;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.LocalDao;
import com.releve.planification.entities.Delegation;
import com.releve.planification.services.LocalService;

@Service
public class LocalServiceImpl implements LocalService {

	@Autowired
	LocalDao localDao;
	@Override
	public void AddLocal(Local local) {
		localDao.AddLocal(local);
	}

	@Override
	public Local getLocalByID(int id) {
		return localDao.getLocalByID(id);
	}

	@Override
	public List<Local> getAllLocalsByDelegation(Delegation delegation) {
		return localDao.getAllLocalsByDelegation(delegation);
	}

}
