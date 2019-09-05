package org.sid.controller;

import java.util.List;

import org.sid.model.Partenaire;
import org.sid.services.PartenaireAssuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/partenaire")
public class PartenaireConroller {
	@Autowired
	private PartenaireAssuranceService partenaireAssuranceServices;
	
	@PostMapping("/savePartenaire")
	public Partenaire savePartenaire(@RequestBody Partenaire partenaire){
		partenaireAssuranceServices.savePartenaire(partenaire);
		return partenaire;	
	}
	@PutMapping("/updatePartenaire")
	public Partenaire updatePartenaire(@RequestBody Partenaire partenaire) {
		partenaireAssuranceServices.updatePartenaire(partenaire);
		return partenaire;
		
	}
	@GetMapping("/GetAllPartenaires")
	public List<Partenaire> findAllPartenaires(){
		return partenaireAssuranceServices.findAllPartenaires();
		
	}
	@DeleteMapping("/deletePartenaire")
	public String deletePartenaire(@RequestParam Long id) {
		partenaireAssuranceServices.deletePartenaire(id);
		return "partenaire deleted succes";
		
	}
}
