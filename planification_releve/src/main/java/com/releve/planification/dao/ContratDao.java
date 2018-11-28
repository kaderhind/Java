package com.releve.planification.dao;

import com.releve.planification.PK.ContratPK;
import com.releve.planification.entities.Contrat;

public interface ContratDao {
	public void AddContrat(Contrat contrat);
	public Contrat getContratByPk(ContratPK contratPK);
	

}
