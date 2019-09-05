package org.sid.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class AppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<AppRole> roles=new ArrayList<>();
	@OneToOne(mappedBy = "appuser")
	private Partenaire partenaire;
	@OneToOne(mappedBy = "appuser")
	private Client client;
	public AppUser() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(String username, String password, Collection<AppRole> roles, Partenaire partenaire, Client client) {
		super();
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.partenaire = partenaire;
		this.client = client;
	}
	public Long getIdAppUser() {
		return id;
	}
	public void setIdAppUser(Long idAppUser) {
		this.id = idAppUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	public Partenaire getPartenaire() {
		return partenaire;
	}
	public void setPartenaire(Partenaire partenaire) {
		this.partenaire = partenaire;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
