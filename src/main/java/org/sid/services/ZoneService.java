package org.sid.services;

import java.util.List;

import org.sid.interfaces.ZoneInterface;
import org.sid.model.Zone;
import org.sid.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZoneService implements ZoneInterface{
	@Autowired
	private ZoneRepository zoneRepo;
	@Override
	public Zone saveZone(Zone zone) {
		// TODO Auto-generated method stub
		return zoneRepo.save(zone);
	}

	@Override
	public Zone updateZone(Zone zone) {
		// TODO Auto-generated method stub
		return zoneRepo.save(zone);
	}

	@Override
	public List<Zone> findAllZones() {
		// TODO Auto-generated method stub
		return zoneRepo.findAll();
	}

	@Override
	public void deleteZone(Long id) {
		// TODO Auto-generated method stub
		zoneRepo.deleteById(id);
	}
	

}
