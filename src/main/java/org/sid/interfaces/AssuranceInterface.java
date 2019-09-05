package org.sid.interfaces;

import java.util.List;

import org.sid.model.Assurance;

public interface AssuranceInterface {
	// to create new insurance
	public Assurance saveAssurance(Assurance assurance);
	
	//to update insurance
	public Assurance updateAssurance(Assurance assurance);
	
	//to fetch all Assurance
	public List<Assurance> findAllAssurances();
	
	//to delete isunrance
	public void deleteAssurance(Long id);

}
