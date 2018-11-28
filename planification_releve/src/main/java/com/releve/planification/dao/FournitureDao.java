package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.entities.Fourniture;

public interface FournitureDao {

	public void AddFourniture(Fourniture fourniture);
	public Fourniture getFournitureById(char id);
	public List<Fourniture> getAllFourniture();
}
