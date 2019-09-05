package org.sid.interfaces;

import java.util.List;

import org.sid.model.Tarification;

public interface TarificationInterface {
	//to save new Tarification
	public Tarification saveTarification(Tarification tarification);
	
	//to update Tarification
	public Tarification updateTarification(Tarification tarification);
	
	//to fetch all Tarification
	public List<Tarification> findAllTarifications();
	
	//to delete Tarification
	public void deleteTarification(Long id);

}
