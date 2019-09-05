package org.sid.interfaces;

import java.util.List;

import org.sid.model.Vehicule;

public interface VehiculeInterface {
	//to save new Car
	public Vehicule saveVehicule(Vehicule vehicule);
	
	//to update Car
	public Vehicule updateVehicule(Vehicule vehicule);
	
	//to fetch all Car from database
	public List<Vehicule> findAllVehicules();
	
	//to delete Car
	public void deleteVehicule(Long id);
	
	
	
}
