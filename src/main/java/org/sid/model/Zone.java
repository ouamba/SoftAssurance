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
public class Zone implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String zone;
	private String ville;
	@OneToMany(mappedBy="zone",fetch = FetchType.LAZY)
	private Collection<Client> clients;
	public Zone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Zone(Long id, String zone, String ville, Collection<Client> clients) {
		super();
		this.id = id;
		this.zone = zone;
		this.ville = ville;
		this.clients = clients;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	/*
	 * public Collection<Client> getClients() { return clients; }
	 */
	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}
	
	
}
