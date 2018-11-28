package com.releve.planification.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.PK.PlanningPK;
import com.releve.planification.entities.Planning;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.TourneePlaning;
import com.releve.planification.services.PlanningService;
import com.releve.planification.services.TourneePlaningService;

@Service
public class TourneePlaningServiceImpl implements TourneePlaningService {

	@Autowired
	PlanningService planningService;

	@Override
	public List<TourneePlaning> getTourneesPlaningLastProduct(List<Tournee> tournees, int fac_prod) {
		Planning p = new Planning();
		TourneePlaning tourneePlaning;
		List<TourneePlaning> tourneePlanings = new ArrayList<TourneePlaning>();
		System.out.println("ici c'est mon service et le fac prod est "+fac_prod);
		if (tournees.size() != 0) {
			for (int i = 0; i < tournees.size(); i++) {
				tourneePlaning = new TourneePlaning();
				p = planningService.getPlanning(tournees.get(i).getReference(), fac_prod-1);
				if (p == null) {
					p = planningService.getPlanning(tournees.get(i).getReference(), fac_prod - 2);
					if (p == null) {
						tourneePlaning.setFac_prod(fac_prod);
						tourneePlaning.setReference(tournees.get(i).getReference());
					} else {
						tourneePlaning.setCd_frn(p.getPlanningPK().getCd_frn());
						tourneePlaning.setDernierDateLecture(p.getDateDebut());
						tourneePlaning.setFac_prod(fac_prod);
						tourneePlaning.setReference(p.getPlanningPK().getReference());
						tourneePlaning.setReleveur(p.getReleveur());
						
					}
				}else{
					tourneePlaning.setCd_frn(p.getPlanningPK().getCd_frn());
					tourneePlaning.setDernierDateLecture(p.getDateDebut());
					tourneePlaning.setFac_prod(fac_prod);
					tourneePlaning.setReference(p.getPlanningPK().getReference());
					tourneePlaning.setReleveur(p.getReleveur());
				}
				tourneePlanings.add(tourneePlaning);
			}

		}
		return tourneePlanings;
	}

	@Override
	public void savePlaningTournees(List<TourneePlaning> tourneePlanings,ResponsableZone responsableZone) {
		
		Planning planning=new Planning();
		PlanningPK planningPK=new PlanningPK();
		for(TourneePlaning tourneePlaning : tourneePlanings){
			planningPK.setCd_frn('0'); // il faut reveoir
			planningPK.setEtape_tournee('0'); // il faut la revoir
			planningPK.setFac_prod(tourneePlaning.getFac_prod());
			planningPK.setNum_cycle(0); // il faut la revoir
			planningPK.setReference(tourneePlaning.getReference());
			planning.setPlanningPK(planningPK);
			planning.setDateDebut(tourneePlaning.getDateDebut());
			planning.setDateFin(tourneePlaning.getDateFin());
			planning.setEtat_planning('O'); // il faut la revoir
			planning.setObservation("rien"); // il faut la revoir 
			planning.setReleveur(tourneePlaning.getReleveur());
			planning.setResponsableZone(responsableZone);
			planningService.AddPlanning(planning);
			
		}
		
		
	}

	@Override
	public List<TourneePlaning> getTourneePlaningCurrentProduct(List<Tournee> tournee, int fac_prod) {
	
		if(tournee.size()!=0){
			Planning p;
			Planning p2;
			List<TourneePlaning> tourneePlanings=new ArrayList<TourneePlaning>();
			for(int i=0;i<tournee.size();i++){
				TourneePlaning tourneePlaning = new TourneePlaning();
				p = planningService.getPlanning(tournee.get(i).getReference(), fac_prod);
				p2=planningService.getPlanning(tournee.get(i).getReference(), fac_prod-1);
				if(p!=null){
					tourneePlaning.setCd_frn(p.getPlanningPK().getCd_frn());
					tourneePlaning.setDernierDateLecture(null);
					if(p2 !=null) {
						tourneePlaning.setDernierDateLecture(p2.getDateDebut());
					}
					tourneePlaning.setDateDebut(p.getDateDebut());
					tourneePlaning.setDateFin(p.getDateFin());
					tourneePlaning.setFac_prod(fac_prod);
					tourneePlaning.setReference(p.getPlanningPK().getReference());
					tourneePlaning.setReleveur(p.getReleveur());
					tourneePlanings.add(tourneePlaning);
				}
				
			}
			return tourneePlanings;
		}
		return null;
	}

	
}
