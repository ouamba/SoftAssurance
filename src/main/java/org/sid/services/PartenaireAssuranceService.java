package org.sid.services;

import java.util.List;

import org.sid.interfaces.PartenaireInterface;
import org.sid.model.Partenaire;
import org.sid.repository.PartenaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PartenaireAssuranceService implements PartenaireInterface{
	
	@Autowired
	private PartenaireRepository partenaireRepo;
	@Override
	public Partenaire savePartenaire(Partenaire partenaire) {
		return partenaireRepo.save(partenaire);
	}

	@Override
	public Partenaire updatePartenaire(Partenaire partenaire) {
		return partenaireRepo.save(partenaire);
	}

	@Override
	public List<Partenaire> findAllPartenaires() {
		return partenaireRepo.findAll();
	}

	@Override
	public void deletePartenaire(Long id) {
		partenaireRepo.deleteById(id);
		
	}

}
