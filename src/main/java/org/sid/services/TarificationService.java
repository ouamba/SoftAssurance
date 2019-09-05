package org.sid.services;

import java.util.List;

import org.sid.interfaces.TarificationInterface;
import org.sid.model.Tarification;
import org.sid.repository.TarificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarificationService implements TarificationInterface{
	@Autowired
	private TarificationRepository tarificationRepo;
	@Override
	public Tarification saveTarification(Tarification tarification) {
		// TODO Auto-generated method stub
		return tarificationRepo.save(tarification);
	}

	@Override
	public Tarification updateTarification(Tarification tarification) {
		// TODO Auto-generated method stub
		return tarificationRepo.save(tarification);
	}

	@Override
	public List<Tarification> findAllTarifications() {
		// TODO Auto-generated method stub
		return tarificationRepo.findAll();
	}

	@Override
	public void deleteTarification(Long id) {
		tarificationRepo.deleteById(id); 
	}

}
