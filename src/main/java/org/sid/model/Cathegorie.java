package org.sid.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cathegorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cat;
	private String obs;
	@OneToMany(mappedBy = "cathegorie", fetch = FetchType.LAZY)
	private Collection<Vehicule> vehicules;
	@OneToMany(mappedBy = "Cathegorie", fetch = FetchType.LAZY)
	private Collection<Tarification> tarifications;
	public Cathegorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cathegorie(String cat, String obs, Collection<Vehicule> vehicules, Collection<Tarification> tarifications) {
		super();
		this.cat = cat;
		this.obs = obs;
		this.vehicules = vehicules;
		this.tarifications = tarifications;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public Collection<Vehicule> getVehicules() {
		return vehicules;
	}
	public void setVehicules(Collection<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}
	public Collection<Tarification> getTarifications() {
		return tarifications;
	}
	public void setTarifications(Collection<Tarification> tarifications) {
		this.tarifications = tarifications;
	}
	
	
}
