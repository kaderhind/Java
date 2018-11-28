package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Delegation;

public interface DelegationService {

	public List<Delegation> getAllDelegation();
	public void AddDelegation(Delegation delegation);
	public Delegation getDelagationById(int ref_dlg);
}
