package org.sid.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Partenaire implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codePartenaire;
	private String nom;
	private String prenom;
	private String ville;
	private int numeroCni;
	private int telephone;
	private char motDePasse;
	@OneToMany(mappedBy = "partenaire", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<StockAttest> stockattestations;
	@OneToMany(mappedBy = "partenaire", fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<StockCr> stockcarteroses;
	@OneToOne
	@JoinColumn(name = "AppUserId",referencedColumnName = "id")
	private AppUser appuser;
	public Partenaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Partenaire(String nom, String prenom, String ville, int numeroCni, int telephone, char motDePasse,
			Collection<StockAttest> stockattestations, Collection<StockCr> stockcarteroses, AppUser appuser) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.numeroCni = numeroCni;
		this.telephone = telephone;
		this.motDePasse = motDePasse;
		this.stockattestations = stockattestations;
		this.stockcarteroses = stockcarteroses;
		this.appuser = appuser;
	}
	public Long getCodePartenaire() {
		return codePartenaire;
	}
	public void setCodePartenaire(Long codePartenaire) {
		this.codePartenaire = codePartenaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getNumeroCni() {
		return numeroCni;
	}
	public void setNumeroCni(int numeroCni) {
		this.numeroCni = numeroCni;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public char getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(char motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Collection<StockAttest> getStockattestations() {
		return stockattestations;
	}
	public void setStockattestations(Collection<StockAttest> stockattestations) {
		this.stockattestations = stockattestations;
	}
	public Collection<StockCr> getStockcarteroses() {
		return stockcarteroses;
	}
	public void setStockcarteroses(Collection<StockCr> stockcarteroses) {
		this.stockcarteroses = stockcarteroses;
	}
	public AppUser getAppuser() {
		return appuser;
	}
	public void setAppuser(AppUser appuser) {
		this.appuser = appuser;
	}
	
}
