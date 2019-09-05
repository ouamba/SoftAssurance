package org.sid.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Tarification implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String se;
	private int tarif;
	private int puisMin;
	private int PuisMax;
	private int tarifAvecRemoque;
	private int tarifB;
	private int tarifC;
	private int tarifBavecR;
	private int tarifCavecR;
	@ManyToOne
	@JoinColumn(name = "codeCathegorie")
	private Cathegorie Cathegorie;
	public Tarification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tarification(String se, int tarif, int puisMin, int puisMax, int tarifAvecRemoque, int tarifB, int tarifC,
			int tarifBavecR, int tarifCavecR, org.sid.model.Cathegorie cathegorie) {
		super();
		this.se = se;
		this.tarif = tarif;
		this.puisMin = puisMin;
		PuisMax = puisMax;
		this.tarifAvecRemoque = tarifAvecRemoque;
		this.tarifB = tarifB;
		this.tarifC = tarifC;
		this.tarifBavecR = tarifBavecR;
		this.tarifCavecR = tarifCavecR;
		Cathegorie = cathegorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSe() {
		return se;
	}
	public void setSe(String se) {
		this.se = se;
	}
	public int getTarif() {
		return tarif;
	}
	public void setTarif(int tarif) {
		this.tarif = tarif;
	}
	public int getPuisMin() {
		return puisMin;
	}
	public void setPuisMin(int puisMin) {
		this.puisMin = puisMin;
	}
	public int getPuisMax() {
		return PuisMax;
	}
	public void setPuisMax(int puisMax) {
		PuisMax = puisMax;
	}
	public int getTarifAvecRemoque() {
		return tarifAvecRemoque;
	}
	public void setTarifAvecRemoque(int tarifAvecRemoque) {
		this.tarifAvecRemoque = tarifAvecRemoque;
	}
	public int getTarifB() {
		return tarifB;
	}
	public void setTarifB(int tarifB) {
		this.tarifB = tarifB;
	}
	public int getTarifC() {
		return tarifC;
	}
	public void setTarifC(int tarifC) {
		this.tarifC = tarifC;
	}
	public int getTarifBavecR() {
		return tarifBavecR;
	}
	public void setTarifBavecR(int tarifBavecR) {
		this.tarifBavecR = tarifBavecR;
	}
	public int getTarifCavecR() {
		return tarifCavecR;
	}
	public void setTarifCavecR(int tarifCavecR) {
		this.tarifCavecR = tarifCavecR;
	}
	public Cathegorie getCathegorie() {
		return Cathegorie;
	}
	public void setCathegorie(Cathegorie cathegorie) {
		Cathegorie = cathegorie;
	}
	
	
}
