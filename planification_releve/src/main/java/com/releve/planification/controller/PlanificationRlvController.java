package com.releve.planification.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.releve.planification.PK.LotPK;
import com.releve.planification.dao.ContratDao;
import com.releve.planification.dao.ZoningDao;
import com.releve.planification.entities.Client;
import com.releve.planification.entities.Delegation;
import com.releve.planification.entities.Lot;
import com.releve.planification.entities.Planning;
import com.releve.planification.entities.Produit;
import com.releve.planification.entities.Refgeo;
import com.releve.planification.entities.Releveur;
import com.releve.planification.entities.ResponsableZone;
import com.releve.planification.entities.Tournee;
import com.releve.planification.entities.TourneePlaning;
import com.releve.planification.entities.TourneeSuivie;
import com.releve.planification.entities.Zone;
import com.releve.planification.services.ClientService;
import com.releve.planification.services.DelegationService;
import com.releve.planification.services.FournitureService;
import com.releve.planification.services.LocalService;
import com.releve.planification.services.LotService;
import com.releve.planification.services.PdaTourneeService;
import com.releve.planification.services.PlanningService;
import com.releve.planification.services.ProduitService;
import com.releve.planification.services.RefgeoService;
import com.releve.planification.services.ReleveurService;
import com.releve.planification.services.ResponsableZoneService;
import com.releve.planification.services.TourneePlaningService;
import com.releve.planification.services.TourneeService;
import com.releve.planification.services.ZoneService;

/**
 * Handles requests for the application home page.
 */
@CrossOrigin()
@RestController
public class PlanificationRlvController {

	private static final Logger logger = LoggerFactory.getLogger(PlanificationRlvController.class);
	private Delegation delegation;
	private List<Lot> lots;
	private Lot lot;
	private int num_produit;
	private List<TourneeSuivie> tourneeSuivies;

	// private Produit produit;
	// private Zone zone;
	private ResponsableZone responsableZone;
	private List<Client> clients;
	private List<Zone> zones;
	private List<Produit> produits;
	private List<Releveur> releveurs;
	private List<Tournee> tournees;

	@Autowired
	DelegationService delegationService;

	@Autowired
	LotService lotService;

	@Autowired
	ZoneService zoneService;

	@Autowired
	ResponsableZoneService responsableZoneService;

	@Autowired
	ReleveurService releveurService;

	@Autowired
	ZoningDao zoningDao;

	@Autowired
	TourneeService tourneeService;

	@Autowired
	LocalService localService;

	@Autowired
	FournitureService fournitureService;

	@Autowired
	RefgeoService refgeoService;

	@Autowired
	ContratDao contratDao;

	@Autowired
	ClientService clientService;

	@Autowired
	ProduitService produitService;

	@Autowired
	PlanningService planningService;

	@Autowired
	TourneePlaningService tourneePlaningService;

	@Autowired
	PdaTourneeService pdaTourneeService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/id", method = RequestMethod.GET)
	public ResponseEntity<List<Refgeo>> home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Tournee tournee = tourneeService.getTourneeByReference(0);
		List<Refgeo> refgeo = refgeoService.getRefgeoByTournee(tournee);
		if (refgeo != null) {
			return new ResponseEntity<List<Refgeo>>(refgeo, HttpStatus.OK);
		}
		return new ResponseEntity<List<Refgeo>>(HttpStatus.NOT_FOUND);

		// Date date = new Date();
		// DateFormat dateFormat =
		// DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		// locale);
		// String formattedDate = dateFormat.format(date);
		// model.addAttribute("serverTime", formattedDate);
		//

	}

	@RequestMapping(value = "/lots", method = RequestMethod.GET)
	public ResponseEntity<List<Lot>> getLot(@RequestParam(value = "type") char[] type) {
		/****
		 * ici il faut ajouter la recherche mm avec la delegation du responsable
		 * connecte
		 *****/
		Date date=new Date();
		lots = new ArrayList<Lot>();
		for (int i = 0; i < type.length; i++) {
			lots.addAll(lotService.getLotByTypeClientAndDelegation(type[i], 1));
		}
		System.out.println("la taille des lots" + lots.size());

		// lots=lotService.getAllLots();
		System.out.println("j ai recus le signale le nombre des lots  est" + lots.size());
		if (lots == null) {
			return new ResponseEntity<List<Lot>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Lot>>(lots, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/clients/", method = RequestMethod.GET)
	public ResponseEntity<List<Client>> getClients() {
		clients = clientService.getClients();
		System.out.println("j ai recus le signale le nombre des lots  est" + clients.size());
		if (clients == null) {
			return new ResponseEntity<List<Client>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/zones", method = RequestMethod.GET)
	public ResponseEntity<List<Zone>> getZones() {
		responsableZone = responsableZoneService.getResponsableZone(123);
		zones = zoneService.getZoneByResponsableZone(responsableZone);
		System.out.println("j ai recus le signale le nombre des zone est" + zones.size());
		if (zones == null) {
			return new ResponseEntity<List<Zone>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Zone>>(zones, HttpStatus.OK);
		}
	}

	@RequestMapping(value = "/produit", method = RequestMethod.GET)
	public ResponseEntity<List<Produit>> getProduit(@RequestParam("fourniture") char frn,
			@RequestParam("numero") int num, @RequestParam("type") char type) {
		LotPK lotPk = new LotPK();
		lotPk.setNumero(num);
		lotPk.setRef_dlg(1);
		lotPk.setType(type);
		lot = lotService.getLotById(lotPk);
		produits = produitService.getProduitByLotAndFourniture(lot, frn);
		System.out.println("j ai recupere les produits	" + produits.size());
		if (produits == null) {
			return new ResponseEntity<List<Produit>>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<List<Produit>>(produits, HttpStatus.OK);
		}

	}

	@RequestMapping(value = "/Tournees/", method = RequestMethod.GET)
	public @ResponseBody List<TourneePlaning> getTournees(@RequestParam("produit") int produit,
			@RequestParam(value="zoning", defaultValue="") int[] zoning) {
		tournees = new ArrayList<Tournee>();
		if (zoning.length == 0) {
			tournees = tourneeService.getTourneeByLotandRespZone(lot, responsableZone);
		} else {
			for (int i = 0; i < zoning.length; i++) {
				tournees.addAll(tourneeService.getTourneeByLotandRespZoneandZoning(lot, responsableZone, zoning[i]));
			}
		}
		return tourneePlaningService.getTourneesPlaningLastProduct(tournees, produit);

	}

	@RequestMapping(value = "/TourneesPalnification/", method = RequestMethod.GET)
	public @ResponseBody List<TourneePlaning> getTourneesPlanification(@RequestParam("produit") int produit,
			@RequestParam(value="zoning", defaultValue="") int []zoning) {
		tournees = new ArrayList<Tournee>();
		if (zoning.length == 0) {
			tournees = tourneeService.getTourneeByLotandRespZone(lot, responsableZone);
		} else {
			for (int i = 0; i < zoning.length; i++) {
				tournees.addAll(tourneeService.getTourneeByLotandRespZoneandZoning(lot, responsableZone, zoning[i]));
			}
		}
		return tourneePlaningService.getTourneePlaningCurrentProduct(tournees, produit);
	}

	@RequestMapping(value = "/TourneesByLot", method = RequestMethod.GET)
	public ResponseEntity<List<TourneeSuivie>> getTourneeByLot(@RequestParam("lot_num") int lot_num,
			@RequestParam("pol_type") char pol_type) {
		LotPK lotPK = new LotPK();
		lotPK.setNumero(lot_num);
		lotPK.setType(pol_type);
		lotPK.setRef_dlg(1);
		lot = lotService.getLotById(lotPK);
		responsableZone = responsableZoneService.getResponsableZone(123);
		tournees = tourneeService.getTourneeByLotandRespZone(lot, responsableZone);
		tourneeSuivies = new ArrayList<TourneeSuivie>();
		Date date=new Date();
		//int current_prod=(date.getYear()+1900)*100+date.getMonth();
		int current_prod=201606;
		for (Tournee tournee : tournees) {
			TourneeSuivie tourneeSuivie = new TourneeSuivie();
			tourneeSuivie.setReference(tournee.getReference());
			System.out.println("********** la reference de la tournee"+tournee.getReference());
			// TourneePlaning
			// tourneePlaning=tourneePlaningService.getTourneesPlaningLastProduct(tournees,
			// fac_prod)
			tourneeSuivie.setEtat('E');
			Planning p = planningService.getPlanning(tournee.getReference(), current_prod);
			tourneeSuivie.setDateDebut(p.getDateDebut());
			tourneeSuivie.setDateFin(p.getDateFin());
			tourneeSuivie.setReleveur(p.getReleveur());
			tourneeSuivie.setProduit(current_prod);
			tourneeSuivie.setNb_idx((long) pdaTourneeService.getNbIndex(tournee.getReference(),current_prod));
			tourneeSuivie.setNb_idx_lus((long) pdaTourneeService.getNbIndexLus(tournee.getReference(),current_prod));
			tourneeSuivie.setNb_idx_non_lus(tourneeSuivie.getNb_idx() - tourneeSuivie.getNb_idx_lus());
			double a = ((double) tourneeSuivie.getNb_idx_lus() / (double) tourneeSuivie.getNb_idx()) * 100;
			tourneeSuivie.setAvancement(a);
			tourneeSuivie.setDateCharegement(planningService.getDateChargement(tournee.getReference(), current_prod));
			tourneeSuivie.setDateDechargement(pdaTourneeService.getDateDechargement(tournee.getReference(),current_prod));
			tourneeSuivies.add(tourneeSuivie);
		}
		System.out.println("le nombre des tournees selon le lot et la zone du responsable connecte " + tournees.size());
		if (tournees != null)
			return new ResponseEntity<List<TourneeSuivie>>(tourneeSuivies, HttpStatus.OK);
		return new ResponseEntity<List<TourneeSuivie>>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value = "/Releveurs/", method = RequestMethod.GET)
	public @ResponseBody List<Releveur> getReleveurs() {
		/*
		 * il faur recuperer les releveurs selon la delegation ou bien la zone a
		 * faire
		 */
		return releveurService.getAllReleveurs();
	}

	@RequestMapping(value = "/save/", method = RequestMethod.POST)
	public ResponseEntity<List<TourneePlaning>> savePlanification(@RequestBody List<TourneePlaning> tourneePlaning) {

		if (tourneePlaning == null)
			return new ResponseEntity<List<TourneePlaning>>(HttpStatus.NOT_FOUND);
		tourneePlaningService.savePlaningTournees(tourneePlaning, responsableZone);
		return new ResponseEntity<List<TourneePlaning>>(HttpStatus.OK);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<ResponsableZone> loginResponsable(@RequestBody ResponsableZone responsableZone) {
		responsableZone = responsableZoneService.login(responsableZone.getMatricule(), responsableZone.getPassword());
		if (responsableZone == null)
			return new ResponseEntity<ResponsableZone>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<ResponsableZone>(HttpStatus.OK);
	}

	public Delegation getDelegation() {
		return delegation;
	}

	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}

	public int getNum_produit() {
		return num_produit;
	}

	public void setNum_produit(int num_produit) {
		this.num_produit = num_produit;
	}

	public List<TourneeSuivie> getTourneeSuivie() {
		return tourneeSuivies;
	}

	public void setTourneeSuivie(List<TourneeSuivie> tourneeSuivies) {
		this.tourneeSuivies = tourneeSuivies;
	}
}
