package org.sid.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class StockAttest implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String attestation;
	private int etat;
	@OneToOne
	@JoinColumn(name = "stockattestations")
	private Assurance assurances;
	@ManyToOne
	@JoinColumn(name = "codePartenaire")
	private Partenaire partenaire;
	public StockAttest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StockAttest(String attestation, int etat, Assurance assurances, Partenaire partenaire) {
		super();
		this.attestation = attestation;
		this.etat = etat;
		this.assurances = assurances;
		this.partenaire = partenaire;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAttestation() {
		return attestation;
	}
	public void setAttestation(String attestation) {
		this.attestation = attestation;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public Assurance getAssurances() {
		return assurances;
	}
	public void setAssurances(Assurance assurances) {
		this.assurances = assurances;
	}
	public Partenaire getPartenaire() {
		return partenaire;
	}
	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}
	
}
