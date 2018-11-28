package com.releve.planification.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.releve.planification.PK.LotPK;

@Entity
@Table(name = "gt_lots_rf")
public class Lot implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private LotPK lotPK;
	
	/*@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="ref_dlg",insertable=false,updatable=false)
	@JsonBackReference
	private Delegation delegation;*/
	
	/*@OneToMany(fetch=FetchType.EAGER,mappedBy="lot")
	@JsonManagedReference
	private List<Produit> produits;*/
	
	public LotPK getLotPK() {
		return lotPK;
	}
	public void setLotPK(LotPK lotPK) {
		this.lotPK = lotPK;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/*public Delegation getDelegation() {
		return delegation;
	}
	public void setDelegation(Delegation delegation) {
		this.delegation = delegation;
	}*/
	/*public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}*/

	
}
