package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Fourniture;

public interface FournitureService {

	public void AddFourniture(Fourniture fourniture);
	public Fourniture getFournitureById(char id);
	public List<Fourniture> getAllFourniture();
}
