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
public class StockCr implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeStockCr;
	private String cathegorie;
	private int etat;
	@OneToOne(mappedBy = "stockcarterose")
	private Assurance assurance;
	@ManyToOne
	@JoinColumn(name = "codePartenaire")
	private Partenaire partenaire;
	public StockCr() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockCr(String cathegorie, int etat, Assurance assurance, Partenaire partenaire) {
		super();
		this.cathegorie = cathegorie;
		this.etat = etat;
		this.assurance = assurance;
		this.partenaire = partenaire;
	}
	public Long getCodeStockCr() {
		return codeStockCr;
	}
	public void setCodeStockCr(Long codeStockCr) {
		this.codeStockCr = codeStockCr;
	}
	public String getCathegorie() {
		return cathegorie;
	}
	public void setCathegorie(String cathegorie) {
		this.cathegorie = cathegorie;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public Assurance getAssurance() {
		return assurance;
	}
	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}
	public Partenaire getPartenaire() {
		return partenaire;
	}
	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}
	
}
