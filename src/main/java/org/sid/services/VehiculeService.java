package org.sid.services;

import java.util.List;

import org.sid.interfaces.VehiculeInterface;
import org.sid.model.Vehicule;
import org.sid.repository.VehiculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class VehiculeService implements VehiculeInterface{
	@Autowired
	private VehiculeRepository vehiculeRepo;

	@Override
	public Vehicule saveVehicule(Vehicule vehicule) {
		return vehiculeRepo.save(vehicule);
	}

	@Override
	public Vehicule updateVehicule(Vehicule vehicule) {
		return vehiculeRepo.save(vehicule);
	}

	@Override
	public List<Vehicule> findAllVehicules() {
		return vehiculeRepo.findAll();
	}

	@Override
	public void deleteVehicule(Long id) {
		vehiculeRepo.deleteById(id);	
	}

}
