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
	private Long codeClient;
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
	
	
}
