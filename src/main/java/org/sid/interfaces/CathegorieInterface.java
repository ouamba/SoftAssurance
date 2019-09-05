package org.sid.interfaces;

import java.util.List;

import org.sid.model.Cathegorie;

public interface CathegorieInterface {
	//to save all cathegorie
	public Cathegorie saveCathegorie(Cathegorie cathegorie);
	
	// to update cathegorie
	public Cathegorie updateCathegorie(Cathegorie cathegorie);
	
	//to fetch all cathegorie
	public List<Cathegorie> findAllCathegorie();
	
	//to delete Cathegorie
	public void deleteCathegorie(Long id);

}
