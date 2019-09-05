package org.sid.controller;

import java.util.List;

import org.sid.model.Cathegorie;
import org.sid.services.CathegorieService;
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
@RequestMapping("/cathegorie")
public class CathegorieController {
	@Autowired
	private CathegorieService cathegorieService;
	
	@PostMapping("/saveCathegorie")
	public Cathegorie saveCathegorie(@RequestBody Cathegorie cathegorie) {
		System.out.println("cathegory successfully registered ");
		cathegorieService.saveCathegorie(cathegorie);
		return cathegorie;
		
	} 
	@PutMapping("/updateCathegorie")
	public Cathegorie updateCathegorie(@RequestBody Cathegorie cathegorie) {
		System.out.println("Cathegory update successfuly");
		cathegorieService.updateCathegorie(cathegorie);
		return cathegorie;
		
	}
	@GetMapping("/getAllCathegorie")
	public List<Cathegorie> findAllCathegories(){
		return cathegorieService.findAllCathegorie();
		
	}
	@DeleteMapping("/deleteCathegorie")
	public String deleteCathegorie(@RequestParam Long id) {
		cathegorieService.deleteCathegorie(id);;
		return "Cathegorie deleted";
	}
}
