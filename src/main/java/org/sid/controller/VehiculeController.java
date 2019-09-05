package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.model.Client;
import org.sid.model.Vehicule;
import org.sid.repository.ClientRepository;
import org.sid.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {
	@Autowired
	private VehiculeService vehiculeRepo;
	@Autowired
	private ClientRepository clientRepo;
	@PostMapping("/saveVehicule/{idClient}")
	public Vehicule saveVehicule(@RequestBody Vehicule vehicule, @PathVariable(value="idClient") Long idClient) {
		if(clientRepo.existsById(idClient)) {
			Client cl=new Client ();
			cl.setId(idClient);
			vehicule.setClient(cl);
			return	vehiculeRepo.saveVehicule(vehicule);	
		}
		return null;
	}
	@PutMapping("/updateVehicule")
	public Vehicule updateVehicule(@RequestBody Vehicule vehicule) {
		vehiculeRepo.saveVehicule(vehicule);
		return vehicule;	
	}
	@GetMapping("/getAllVehicule")
	public List<Vehicule> findAllVehicule(){
		return vehiculeRepo.findAllVehicules();	
	}
	@DeleteMapping("/deleteVehicule")
	public String deleteVehicule(@RequestParam Long id) {
		vehiculeRepo.deleteVehicule(id);
		return "Deleted vehicule success";		
	}
}
