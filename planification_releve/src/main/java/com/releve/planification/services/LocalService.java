package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Local;

import com.releve.planification.entities.Delegation;

public interface LocalService {
	public void AddLocal(Local local);
	public Local getLocalByID(int id);
	public List<Local> getAllLocalsByDelegation(Delegation delegation);

}
