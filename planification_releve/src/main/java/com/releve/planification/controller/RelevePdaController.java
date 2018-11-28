package com.releve.planification.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.releve.planification.PK.PlanningPK;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.PdaTournee;
import com.releve.planification.entities.Refgeo;
import com.releve.planification.services.LotService;
import com.releve.planification.services.PdaTourneeService;
import com.releve.planification.services.PlanningService;
import com.releve.planification.services.RefgeoService;
import com.releve.planification.services.TourneeService;

@RestController
public class RelevePdaController {
	
	@Autowired
	PdaTourneeService pdaTourneeService;
	@Autowired
	TourneeService tourneeService;
	@Autowired
	RefgeoService refgeoService;
	
	@Autowired
	PlanningService planningService;

	@RequestMapping(value="/AddPdaTournee",method=RequestMethod.GET)
	public ResponseEntity<PdaTournee> AddRelevePda(){
		PdaTournee pdaTournee=new PdaTournee();
		pdaTournee.setAdr_cons("coco je suis la ");
		pdaTournee.setCd_relecture(0);
		pdaTournee.setCli_id(1);
		pdaTournee.setCli_nom("coco je suis la ");
		pdaTournee.setCons_m1(0);
		pdaTournee.setCons_m2(0);
		pdaTournee.setCpt_amp(0);
		pdaTournee.setCpt_num("hi hello");
		pdaTournee.setLoc_id(0);
		pdaTournee.setMatr_resp(0);
		pdaTournee.setRlv_nidx1(10);
		pdaTournee.setPol_num("coco");
		try{
			pdaTourneeService.AddPdaTournee(pdaTournee);
		}catch( Exception e){
			e.printStackTrace();
			return new ResponseEntity<PdaTournee>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<PdaTournee>(pdaTournee,HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/chargerTournee",method=RequestMethod.GET)
	public ResponseEntity<List<PdaTournee>> chargerTournees(){
	
		int matricule=0;
		int ref_tournee=0;
		List<Refgeo> refgeos=refgeoService.getRefgeoByTournee(tourneeService.getTourneeByReference(ref_tournee));
		List<PdaTournee> pdaTournees=new ArrayList<PdaTournee>();
		for( Refgeo refgeo: refgeos){
			
			PdaTournee pdaTournee=new PdaTournee();
		//	pdaTournee.setMatr_resp(mtaricule);
			pdaTournee.setCli_id(refgeo.getLocal().getContrat().getClient().getId());
			pdaTournee.setCli_nom(refgeo.getLocal().getContrat().getClient().getNom());
			pdaTournee.setLoc_id(refgeo.getLocal().getId());
			pdaTournee.setMatr_rlv(matricule);
			pdaTournee.setPol_etat(refgeo.getLocal().getContrat().getPol_etat());
			pdaTournee.setPol_num(refgeo.getLocal().getContrat().getContratPK().getNumero());
			pdaTournee.setCpt_num("coco");
			pdaTournee.setRlv_adate(refgeo.getRlv_date());
		
			pdaTournee.setRlv_aidx(refgeo.getRlv_nidx());
			pdaTournees.add(pdaTournee);
			//planningService.AddDateChargement(new Date(), 201605,ref_tournee);
		}
		
		return new ResponseEntity<List<PdaTournee>>(pdaTournees,HttpStatus.OK);
	}
	
	

}
