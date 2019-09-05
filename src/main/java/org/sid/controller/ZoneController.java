package org.sid.controller;

import java.util.List;

import org.sid.model.Client;
import org.sid.model.Zone;
import org.sid.repository.ClientRepository;
import org.sid.services.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zone")
public class ZoneController {
	@Autowired
	private ZoneService zoneRepo;
	
	@PostMapping("/saveZone")
	public Zone saveZone(@RequestBody Zone zone) {
		zoneRepo.saveZone(zone);
		return zone;
	}
	@PostMapping("/updateZone")
	public Zone updateZone(@RequestBody Zone zone) {
		zoneRepo.updateZone(zone);
		return zone;	
	}
	@GetMapping("/getAllZone")
	public List<Zone> findAllZone(){
		return zoneRepo.findAllZones();	
	}
	@DeleteMapping("/deleteZone")
	public String deleteZone(@RequestParam Long id) {
		zoneRepo.deleteZone(id);
		return "deleted zone successfuly";
		
	}
}
