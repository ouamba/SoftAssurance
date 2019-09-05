package org.sid.services;

import java.util.List;

import org.sid.interfaces.CathegorieInterface;
import org.sid.model.Cathegorie;
import org.sid.repository.CathegorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CathegorieService implements CathegorieInterface {
	
	@Autowired
	private CathegorieRepository cathegorieRepo;
	@Override
	public Cathegorie saveCathegorie(Cathegorie cathegorie) {
		return cathegorieRepo.save(cathegorie);
	}

	@Override
	public Cathegorie updateCathegorie(Cathegorie cathegorie) {
		return cathegorieRepo.save(cathegorie);
	}

	@Override
	public List<Cathegorie> findAllCathegorie() {
		return cathegorieRepo.findAll();
	}

	@Override
	public void deleteCathegorie(Long id) {
		cathegorieRepo.deleteById(id);
		
	}

}
