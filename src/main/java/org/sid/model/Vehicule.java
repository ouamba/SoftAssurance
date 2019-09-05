package org.sid.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

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
public class Vehicule implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date datePmc;
	private String immatriculation;
	private String chassis;
	private String marque;
	private String type;
	private String carosserie;
	private String sourceEnergie;
	private int puissance;
	private String nombrePlace;
	private int poidesAvide;
	private int chargeUtile;
	private int valeurANeuf;
	@OneToMany(mappedBy = "vehicule", fetch = FetchType.LAZY)
	private Collection<Assurance> assurances;
	@ManyToOne
	@JoinColumn(name="codeClient")
	private Client client;
	@ManyToOne
	@JoinColumn(name = "codeCathegorie")
	private Cathegorie cathegorie;
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(Date datePmc, String immatriculation, String chassis, String marque, String type, String carosserie,
			String sourceEnergie, int puissance, String nombrePlace, int poidesAvide, int chargeUtile, int valeurANeuf,
			Collection<Assurance> assurances, Client client, Cathegorie cathegorie) {
		super();
		this.datePmc = datePmc;
		this.immatriculation = immatriculation;
		this.chassis = chassis;
		this.marque = marque;
		this.type = type;
		this.carosserie = carosserie;
		this.sourceEnergie = sourceEnergie;
		this.puissance = puissance;
		this.nombrePlace = nombrePlace;
		this.poidesAvide = poidesAvide;
		this.chargeUtile = chargeUtile;
		this.valeurANeuf = valeurANeuf;
		this.assurances = assurances;
		this.client = client;
		this.cathegorie = cathegorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDatePmc() {
		return datePmc;
	}
	public void setDatePmc(Date datePmc) {
		this.datePmc = datePmc;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCarosserie() {
		return carosserie;
	}
	public void setCarosserie(String carosserie) {
		this.carosserie = carosserie;
	}
	public String getSourceEnergie() {
		return sourceEnergie;
	}
	public void setSourceEnergie(String sourceEnergie) {
		this.sourceEnergie = sourceEnergie;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getNombrePlace() {
		return nombrePlace;
	}
	public void setNombrePlace(String nombrePlace) {
		this.nombrePlace = nombrePlace;
	}
	public int getPoidesAvide() {
		return poidesAvide;
	}
	public void setPoidesAvide(int poidesAvide) {
		this.poidesAvide = poidesAvide;
	}
	public int getChargeUtile() {
		return chargeUtile;
	}
	public void setChargeUtile(int chargeUtile) {
		this.chargeUtile = chargeUtile;
	}
	public int getValeurANeuf() {
		return valeurANeuf;
	}
	public void setValeurANeuf(int valeurANeuf) {
		this.valeurANeuf = valeurANeuf;
	}
	public Collection<Assurance> getAssurances() {
		return assurances;
	}
	public void setAssurances(Collection<Assurance> assurances) {
		this.assurances = assurances;
	}

	/*
	 * public Client getClient() { return client; }
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	public Cathegorie getCathegorie() {
		return cathegorie;
	}
	public void setCathegorie(Cathegorie cathegorie) {
		this.cathegorie = cathegorie;
	}
	
}
