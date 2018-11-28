package com.releve.planification.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pda_tournee")
public class PdaTournee {

	@Column(name="frn_cod")
		char frn_cod;
	
	@Id
	@Column(name="pol_num")
	private String pol_num;
	
	@Column(name="pol_etat")
	private char pol_etat;
	
	
	@Column(name="cli_id")
	private int cli_id;
	@Column(name="loc_id")
	private int loc_id;

	@Column(name="cli_nom")
	private String cli_nom;
	
	@Column(name="cpt_num")
	private String cpt_num;
	
	@Column(name="adr_cons")
	private String adr_cons;
	
	@Column(name="num_gsm")
	private String num_gsm;
	
	@Column(name="ref_sec")
	private int ref_sec;
	@Column(name="ref_trn")
	private int ref_trn;
	
	@Column(name="ref_ord")
	private int ref_ord;
	
	@Column(name="loc_idg")
	private int loc_idg;
	
	@Column(name="pol_typc")
	private char pol_typc;
	
	@Column(name="cpt_fils")
	private char cpt_fils;
	@Column(name="cpt_tens")
	private char cpt_tens;
	@Column(name="cpt_amp")
	private int cpt_amp;
	
	@Column(name="cpt_cal")
	private int cpt_cal;
	
	@Column(name="cpt_sys")
	private int cpt_sys;
	
	@Column(name="type_br")
	private char type_br;
	
	@Column(name="emp_cpt")
	private char emp_cpt;
	
	@Column(name="cpt_roue")
	private char cpt_roue;
	@Column(name="cpt_coef")
	private int cpt_coef;
	
	@Column(name="plombe")
	private char plombe;
	
	@Column(name="marque")
	private String marque;
	
	@Column(name="rlv_prod")
	private int rlv_prod;
	
	@Column(name="ref_tournee")
	private int ref_tournee;
	
	@Column(name="ref_folio")
	private int ref_folio;
	@Column(name="nv_folio")
	private int nv_folio;
	
	@Column(name="rlv_adate")
	private Date rlv_adate;
	
	@Column(name="rlv_ndate1")
	private Date rlv_ndate1;
	
	@Column(name="rlv_ndate2")
	private Date rlv_ndate2;
	
	@Column(name="rlv_aidx")
	private int rlv_aidx;
	@Column(name="rlv_nidx1")
	private int rlv_nidx1;
	
	@Column(name="rlv_nidx2")
	private int rlv_nidx2;
	
	@Column(name="rlv_cons1")
	private int rlv_cons1;
	@Column(name="rlv_cons2")
	private int rlv_cons2;
	@Column(name="ref_abs")
	private char ref_abs;
	@Column(name="rlv_obs")
	private String rlv_obs;
	@Column(name="rlv_ecpt")
	private char rlv_ecpt;
	@Column(name="rlv_anoc")
	private char rlv_anoc;
	@Column(name="rlv_code")
	private char rlv_code;
	@Column(name="cons_na1")
	private int cons_na1;
	@Column(name="cons_n1a1")
	private int cons_n1a1;
	@Column(name="cons_m1")
	private int cons_m1;
	@Column(name="cons_m2")
	private int cons_m2;
	@Column(name="cons_moy")
	private int cons_moy;
	@Column(name="rlv_typc")
	private char rlv_typc;
	@Column(name="puit")
	private char puit;
	@Column(name="nbr_abs")
	private int  nbr_abs;
	@Column(name="matr_rlv")
	private int matr_rlv;
	@Column(name="matr_resp")
	private int matr_resp;
	@Column(name="fraude")
	private char fraude;
	@Column(name="cpt_coupe")
	private char cpt_coupe;
	@Column(name="nv_client")
	private int nv_client;
	@Column(name="num_cycle")
	private int num_cycle;
	@Column(name="cd_relecture")
	private int cd_relecture;
	@Column(name="pol_usag")
	private String pol_usag;
	@Column(name="num_lect")
	private int num_lect;

	public String getPol_num() {
		return pol_num;
	}
	public void setPol_num(String pol_num) {
		this.pol_num = pol_num;
	}
	public char getPol_etat() {
		return pol_etat;
	}
	public void setPol_etat(char pol_etat) {
		this.pol_etat = pol_etat;
	}
	public int getCli_id() {
		return cli_id;
	}
	public void setCli_id(int cli_id) {
		this.cli_id = cli_id;
	}
	public int getLoc_id() {
		return loc_id;
	}
	public void setLoc_id(int loc_id) {
		this.loc_id = loc_id;
	}
	public String getCli_nom() {
		return cli_nom;
	}
	public void setCli_nom(String cli_nom) {
		this.cli_nom = cli_nom;
	}
	public String getCpt_num() {
		return cpt_num;
	}
	public void setCpt_num(String cpt_num) {
		this.cpt_num = cpt_num;
	}
	public String getAdr_cons() {
		return adr_cons;
	}
	public void setAdr_cons(String adr_cons) {
		this.adr_cons = adr_cons;
	}
	public String getNum_gsm() {
		return num_gsm;
	}
	public void setNum_gsm(String num_gsm) {
		this.num_gsm = num_gsm;
	}
	public int getRef_sec() {
		return ref_sec;
	}
	public void setRef_sec(int ref_sec) {
		this.ref_sec = ref_sec;
	}
	public int getRef_trn() {
		return ref_trn;
	}
	public void setRef_trn(int ref_trn) {
		this.ref_trn = ref_trn;
	}
	public int getRef_ord() {
		return ref_ord;
	}
	public void setRef_ord(int ref_ord) {
		this.ref_ord = ref_ord;
	}
	public int getLoc_idg() {
		return loc_idg;
	}
	public void setLoc_idg(int loc_idg) {
		this.loc_idg = loc_idg;
	}
	public char getPol_typc() {
		return pol_typc;
	}
	public void setPol_typc(char pol_typc) {
		this.pol_typc = pol_typc;
	}
	public char getCpt_fils() {
		return cpt_fils;
	}
	public void setCpt_fils(char cpt_fils) {
		this.cpt_fils = cpt_fils;
	}
	public char getCpt_tens() {
		return cpt_tens;
	}
	public void setCpt_tens(char cpt_tens) {
		this.cpt_tens = cpt_tens;
	}
	public int getCpt_amp() {
		return cpt_amp;
	}
	public void setCpt_amp(int cpt_amp) {
		this.cpt_amp = cpt_amp;
	}
	public int getCpt_cal() {
		return cpt_cal;
	}
	public void setCpt_cal(int cpt_cal) {
		this.cpt_cal = cpt_cal;
	}
	public int getCpt_sys() {
		return cpt_sys;
	}
	public void setCpt_sys(int cpt_sys) {
		this.cpt_sys = cpt_sys;
	}
	public char getType_br() {
		return type_br;
	}
	public void setType_br(char type_br) {
		this.type_br = type_br;
	}
	public char getEmp_cpt() {
		return emp_cpt;
	}
	public void setEmp_cpt(char emp_cpt) {
		this.emp_cpt = emp_cpt;
	}
	public char getCpt_roue() {
		return cpt_roue;
	}
	public void setCpt_roue(char cpt_roue) {
		this.cpt_roue = cpt_roue;
	}
	public int getCpt_coef() {
		return cpt_coef;
	}
	public void setCpt_coef(int cpt_coef) {
		this.cpt_coef = cpt_coef;
	}
	public char getPlombe() {
		return plombe;
	}
	public void setPlombe(char plombe) {
		this.plombe = plombe;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public int getRlv_prod() {
		return rlv_prod;
	}
	public void setRlv_prod(int rlv_prod) {
		this.rlv_prod = rlv_prod;
	}
	
	public int getRef_folio() {
		return ref_folio;
	}
	public void setRef_folio(int ref_folio) {
		this.ref_folio = ref_folio;
	}
	public int getNv_folio() {
		return nv_folio;
	}
	public void setNv_folio(int nv_folio) {
		this.nv_folio = nv_folio;
	}
	public Date getRlv_adate() {
		return rlv_adate;
	}
	public void setRlv_adate(Date rlv_adate) {
		this.rlv_adate = rlv_adate;
	}
	public Date getRlv_ndate1() {
		return rlv_ndate1;
	}
	public void setRlv_ndate1(Date rlv_ndate1) {
		this.rlv_ndate1 = rlv_ndate1;
	}
	public Date getRlv_ndate2() {
		return rlv_ndate2;
	}
	public void setRlv_ndate2(Date rlv_ndate2) {
		this.rlv_ndate2 = rlv_ndate2;
	}
	public int getRlv_aidx() {
		return rlv_aidx;
	}
	public void setRlv_aidx(int rlv_aidx) {
		this.rlv_aidx = rlv_aidx;
	}
	public int getRlv_nidx1() {
		return rlv_nidx1;
	}
	public void setRlv_nidx1(int rlv_nidx1) {
		this.rlv_nidx1 = rlv_nidx1;
	}
	public int getRlv_nidx2() {
		return rlv_nidx2;
	}
	public void setRlv_nidx2(int rlv_nidx2) {
		this.rlv_nidx2 = rlv_nidx2;
	}
	public int getRlv_cons1() {
		return rlv_cons1;
	}
	public void setRlv_cons1(int rlv_cons1) {
		this.rlv_cons1 = rlv_cons1;
	}
	public int getRlv_cons2() {
		return rlv_cons2;
	}
	public void setRlv_cons2(int rlv_cons2) {
		this.rlv_cons2 = rlv_cons2;
	}
	public char getRef_abs() {
		return ref_abs;
	}
	public void setRef_abs(char ref_abs) {
		this.ref_abs = ref_abs;
	}
	public String getRlv_obs() {
		return rlv_obs;
	}
	public void setRlv_obs(String rlv_obs) {
		this.rlv_obs = rlv_obs;
	}
	public char getRlv_ecpt() {
		return rlv_ecpt;
	}
	public void setRlv_ecpt(char rlv_ecpt) {
		this.rlv_ecpt = rlv_ecpt;
	}
	public char getRlv_anoc() {
		return rlv_anoc;
	}
	public void setRlv_anoc(char rlv_anoc) {
		this.rlv_anoc = rlv_anoc;
	}
	public char getRlv_code() {
		return rlv_code;
	}
	public void setRlv_code(char rlv_code) {
		this.rlv_code = rlv_code;
	}
	public int getCons_na1() {
		return cons_na1;
	}
	public void setCons_na1(int cons_na1) {
		this.cons_na1 = cons_na1;
	}
	public int getCons_n1a1() {
		return cons_n1a1;
	}
	public void setCons_n1a1(int cons_n1a1) {
		this.cons_n1a1 = cons_n1a1;
	}
	public int getCons_m1() {
		return cons_m1;
	}
	public void setCons_m1(int cons_m1) {
		this.cons_m1 = cons_m1;
	}
	public int getCons_m2() {
		return cons_m2;
	}
	public void setCons_m2(int cons_m2) {
		this.cons_m2 = cons_m2;
	}
	public int getCons_moy() {
		return cons_moy;
	}
	public void setCons_moy(int cons_moy) {
		this.cons_moy = cons_moy;
	}
	public char getRlv_typc() {
		return rlv_typc;
	}
	public void setRlv_typc(char rlv_typc) {
		this.rlv_typc = rlv_typc;
	}
	public char getPuit() {
		return puit;
	}
	public void setPuit(char puit) {
		this.puit = puit;
	}
	public int getNbr_abs() {
		return nbr_abs;
	}
	public void setNbr_abs(int nbr_abs) {
		this.nbr_abs = nbr_abs;
	}
	public int getMatr_rlv() {
		return matr_rlv;
	}
	public void setMatr_rlv(int matr_rlv) {
		this.matr_rlv = matr_rlv;
	}
	public int getMatr_resp() {
		return matr_resp;
	}
	public void setMatr_resp(int matr_resp) {
		this.matr_resp = matr_resp;
	}
	public char getFraude() {
		return fraude;
	}
	public void setFraude(char fraude) {
		this.fraude = fraude;
	}
	public char getCpt_coupe() {
		return cpt_coupe;
	}
	public void setCpt_coupe(char cpt_coupe) {
		this.cpt_coupe = cpt_coupe;
	}
	public int getNv_client() {
		return nv_client;
	}
	public void setNv_client(int nv_client) {
		this.nv_client = nv_client;
	}
	public int getNum_cycle() {
		return num_cycle;
	}
	public void setNum_cycle(int num_cycle) {
		this.num_cycle = num_cycle;
	}
	public int getCd_relecture() {
		return cd_relecture;
	}
	public void setCd_relecture(int cd_relecture) {
		this.cd_relecture = cd_relecture;
	}
	public String getPol_usage() {
		return pol_usag;
	}
	public void setPol_usage(String pol_usag) {
		this.pol_usag = pol_usag;
	}
	public int getNum_lect() {
		return num_lect;
	}
	public void setNum_lect(int num_lect) {
		this.num_lect = num_lect;
	}
	public char getFrn_cod() {
		return frn_cod;
	}
	public void setFrn_cod(char frn_cod) {
		this.frn_cod = frn_cod;
	}
	public int getRef_tournee() {
		return ref_tournee;
	}
	public void setRef_tournee(int ref_tournee) {
		this.ref_tournee = ref_tournee;
	}
	
}
