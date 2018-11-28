package com.releve.planification.dao;

import java.util.List;



import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Local;

public interface LocalDao {

	public void AddLocal(Local local);
	public Local getLocalByID(int id);
	public List<Local> getAllLocalsByDelegation(Delegation delegation);
	
}
