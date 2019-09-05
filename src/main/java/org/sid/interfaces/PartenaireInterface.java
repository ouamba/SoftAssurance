package org.sid.interfaces;

import java.util.List;

import org.sid.model.Partenaire;

public interface PartenaireInterface {
	// to save all partenaire
	public Partenaire savePartenaire(Partenaire partenaire);
	
	//to update partenaire
	public Partenaire updatePartenaire(Partenaire partenaire);
	
	//to fetch all partenaire from database
	public List<Partenaire> findAllPartenaires();
	
	//to delete partenaire
	public void deletePartenaire(Long id);

}
