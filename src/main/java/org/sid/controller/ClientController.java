package org.sid.controller;

import java.util.List;

import org.sid.model.Client;
import org.sid.model.Zone;
import org.sid.repository.ZoneRepository;
import org.sid.services.ClientAssuranceService;
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

@RequestMapping("/client")
public class ClientController {
	@Autowired
	private ClientAssuranceService clientRepo;
	@Autowired
	private ZoneRepository zoneRepo;
	@PostMapping("/saveClient/{idZone}")
	public Client saveClient(@RequestBody Client client, @PathVariable(value="idZone") Long idZone) {
		if(zoneRepo.existsById(idZone)) {
			Zone zn = new Zone();
			zn.setId(idZone);
			client.setZone(zn);
			return clientRepo.saveClient(client);
		}
		//System.out.println("client save avec succès");
		return null;	
	}
	@GetMapping("/getAllClients/")
	public List<Client> findAllClient(){
		return clientRepo.findAllClients();
		
	}
	@PutMapping("/updateClient")
	public Client updateClient(@RequestBody Client client) {
		return clientRepo.saveClient(client);
		
	}
	@DeleteMapping("/deleteClient")
	public String deleteClient(@RequestParam Long id) {
		clientRepo.deleteClient(id);
		 return"Client deleted";
		
	}
	
}
