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

public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private int attributs;
	private int telephone;
	private String profession;
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private Collection<Vehicule> vehicules;
	@ManyToOne
	@JoinColumn(name = "codeZone")
	private Zone zone;
	@OneToOne
	@JoinColumn(name = "AppUserId", referencedColumnName = "id")
	private AppUser appuser;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(Long id, String nom, String prenom, int attributs, int telephone, String profession,
			Collection<Vehicule> vehicules, Zone zone, AppUser appuser) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.attributs = attributs;
		this.telephone = telephone;
		this.profession = profession;
		this.vehicules = vehicules;
		this.zone = zone;
		this.appuser = appuser;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public int getAttributs() {
		return attributs;
	}
	public void setAttributs(int attributs) {
		this.attributs = attributs;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public AppUser getAppuser() {
		return appuser;
	}
	public void setAppuser(AppUser appuser) {
		this.appuser = appuser;
	}
	
	
}
