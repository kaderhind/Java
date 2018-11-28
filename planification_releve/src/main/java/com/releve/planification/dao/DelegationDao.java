package com.releve.planification.dao;
import java.util.List;

import com.releve.planification.entities.Delegation;;

public interface DelegationDao {
	
	public void AddDelegation(Delegation delegation);
	public List<Delegation> delegations();
	public Delegation getDelegationById(int id);

}
