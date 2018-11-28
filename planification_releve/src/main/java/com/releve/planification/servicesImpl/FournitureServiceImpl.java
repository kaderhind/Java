package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.FournitureDao;
import com.releve.planification.entities.Fourniture;
import com.releve.planification.services.FournitureService;

@Service
public class FournitureServiceImpl implements FournitureService{

	@Autowired
	FournitureDao  fournitureDao;
	@Override
	public void AddFourniture(Fourniture fourniture) {
		fournitureDao.AddFourniture(fourniture);
	}

	@Override
	public Fourniture getFournitureById(char id) {
		return fournitureDao.getFournitureById(id);
	}

	@Override
	public List<Fourniture> getAllFourniture() {
		return fournitureDao.getAllFourniture();
	}

}
