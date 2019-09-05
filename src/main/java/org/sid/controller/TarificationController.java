package org.sid.controller;

import java.util.List;

import org.sid.model.Tarification;
import org.sid.services.TarificationService;
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
@RequestMapping("/tarification")
public class TarificationController {
	@Autowired
	private TarificationService tarificationRepo;
	
	@PostMapping("/saveTarification")
	public Tarification saveTarification(@RequestBody Tarification tarification) {
		System.out.println("save tarification success");
		tarificationRepo.saveTarification(tarification);
		return tarification;	
	}
	@PutMapping("/updateTarification")
	public Tarification updateTarification(@RequestBody Tarification tarification) {
		tarificationRepo.updateTarification(tarification);
		return tarification;	
	}
	@GetMapping("/getAllTarification")
	public List<Tarification> findAllTarification(){
		return tarificationRepo.findAllTarifications();	
	}
	@DeleteMapping("/deleteTarification")
	public String deleteTarification(@RequestParam Long id) {
		tarificationRepo.deleteTarification(id);
		return "delete Tarification success";
		
	}
}
