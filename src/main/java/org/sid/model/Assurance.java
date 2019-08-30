package org.sid.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Assurance implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeAssurance;
	private int durees;
	private Date dateEffet;
	private Date dateEmission;
	private Date dateExpiration;
	private int etatDta;
	private String dr;
	private String ipt;
	private String ar;
	private String b;
	private String vol;
	private String bdg;
	private int icd;
	@OneToOne(mappedBy = "assurances")
	private StockAttest stockattestations;
	@ManyToOne
	@JoinColumn(name = "codeVehicule")
	private Vehicule vehicule;
	@OneToOne
	@JoinColumn(name = "codeStockCr")
	private StockCr stockcarterose;
	public Assurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Assurance(int durees, Date dateEffet, Date dateEmission, Date dateExpiration, int etatDta, String dr,
			String ipt, String ar, String b, String vol, String bdg, int icd, StockAttest stockattestations,
			Vehicule vehicules, StockCr stockcr) {
		super();
		this.durees = durees;
		this.dateEffet = dateEffet;
		this.dateEmission = dateEmission;
		this.dateExpiration = dateExpiration;
		this.etatDta = etatDta;
		this.dr = dr;
		this.ipt = ipt;
		this.ar = ar;
		this.b = b;
		this.vol = vol;
		this.bdg = bdg;
		this.icd = icd;
		this.stockattestations = stockattestations;
		this.vehicule = vehicules;
		this.stockcarterose = stockcr;
	}
	public Long getCodeAssurance() {
		return codeAssurance;
	}
	public void setCodeAssurance(Long codeAssurance) {
		this.codeAssurance = codeAssurance;
	}
	public int getDurees() {
		return durees;
	}
	public void setDurees(int durees) {
		this.durees = durees;
	}
	public Date getDateEffet() {
		return dateEffet;
	}
	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}
	public Date getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public int getEtatDta() {
		return etatDta;
	}
	public void setEtatDta(int etatDta) {
		this.etatDta = etatDta;
	}
	public String getDr() {
		return dr;
	}
	public void setDr(String dr) {
		this.dr = dr;
	}
	public String getIpt() {
		return ipt;
	}
	public void setIpt(String ipt) {
		this.ipt = ipt;
	}
	public String getAr() {
		return ar;
	}
	public void setAr(String ar) {
		this.ar = ar;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getVol() {
		return vol;
	}
	public void setVol(String vol) {
		this.vol = vol;
	}
	public String getBdg() {
		return bdg;
	}
	public void setBdg(String bdg) {
		this.bdg = bdg;
	}
	public int getIcd() {
		return icd;
	}
	public void setIcd(int icd) {
		this.icd = icd;
	}
	public StockAttest getStockattestations() {
		return stockattestations;
	}
	public void setStockattestations(StockAttest stockattestations) {
		this.stockattestations = stockattestations;
	}
	public Vehicule getVehicules() {
		return vehicule;
	}
	public void setVehicules(Vehicule vehicules) {
		this.vehicule = vehicules;
	}
	public StockCr getStockcr() {
		return stockcarterose;
	}
	public void setStockcr(StockCr stockcr) {
		this.stockcarterose = stockcr;
	}
	
}
