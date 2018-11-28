package com.releve.planification.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


 @Entity
@DiscriminatorValue("Rsp")
public class ResponsableZone extends Agent {

	 	/*@OneToMany(mappedBy="responsableZone",fetch=FetchType.EAGER)
		private List<Zone> zones;
	 
	 public List<Zone> getZones() {
		return zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;
	}*/

}
