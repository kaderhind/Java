package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.PK.RefgeoPK;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Fourniture;
import com.releve.planification.entities.Local;
import com.releve.planification.entities.Refgeo;
import com.releve.planification.entities.Tournee;

public interface RefgeoDao {
	public void AddRefgeo(Refgeo refgeo);
	public Refgeo getRefgeoByPk(RefgeoPK refgeoPK);
	public List<Refgeo> getRefgeoByDelegation(Delegation delegation);
	public Refgeo getRefgeoByLocalAndFourniture(Local local,Fourniture fourniture);
	public List<Refgeo> getRefgeoByTournee(Tournee tournee);

}
