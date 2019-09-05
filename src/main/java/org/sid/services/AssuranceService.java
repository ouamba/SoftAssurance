package org.sid.services;

import java.util.List;

import org.sid.interfaces.AssuranceInterface;
import org.sid.model.Assurance;
import org.sid.repository.AssuranceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AssuranceService implements AssuranceInterface{
	@Autowired
	private AssuranceRepository  assuranceRepo;
	@Override
	public Assurance saveAssurance(Assurance assurance) {
		return assuranceRepo.save(assurance);
	}

	@Override
	public Assurance updateAssurance(Assurance assurance) {
		return assuranceRepo.save(assurance);
	}

	@Override
	public List<Assurance> findAllAssurances() {
		return assuranceRepo.findAll();
	}

	@Override
	public void deleteAssurance(Long id) {
		assuranceRepo.deleteById(id);
		
	}

}
