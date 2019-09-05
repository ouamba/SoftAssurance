package org.sid.controller;

import java.util.List;

import org.sid.model.Assurance;
import org.sid.services.AssuranceService;
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
@RequestMapping("/assurance")
public class AssuranceController {
	@Autowired
	private AssuranceService assuranceService;
	
	@PostMapping("/saveAssurance")
	public Assurance saveAssurance(@RequestBody Assurance assurance) {
		System.out.println("insurance save success");
		 assuranceService.saveAssurance(assurance);
		 return assurance;	
	}
	@PutMapping("/updateAssurance")
	public Assurance updateAssurance(@RequestBody Assurance assurance ) {
		return assuranceService.updateAssurance(assurance);		
	}
	@GetMapping("/getAllAssurance")
	public List<Assurance> findAllAssurances(){
		return assuranceService.findAllAssurances();
	}
	@DeleteMapping("/deleteAssurance")
	public String deleteAssurance(@RequestParam Long id) {
		assuranceService.deleteAssurance(id);
		return "Assurance deleted";
		
		
	}
}
