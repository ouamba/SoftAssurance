package org.sid.controller;

import java.util.List;

import org.sid.model.StockAttest;
import org.sid.services.StockAttestService;
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
@RequestMapping("/StockAttest")
public class StockAttestController {
	@Autowired
	private StockAttestService stockAttestService;
	
	@PostMapping("/saveStockAttest")
	public StockAttest saveStockAttest(@RequestBody StockAttest stockAttest) {
		System.out.println("stockAttest save successfuly");
		stockAttestService.saveStockAttest(stockAttest);
		return stockAttest;	
	} 
	@PutMapping("/updateStockAttest")
	public StockAttest updateStockAttest(@RequestBody StockAttest stockAttest) {
		System.out.println("StockAttest update successfuly");
		stockAttestService.updateStockAttest(stockAttest);
		return stockAttest;	
	}
	@GetMapping("/GetAllStockAttest")
	public List<StockAttest> findAllStockAttest(){
		return stockAttestService.findAllStockAttests();
	}
	@DeleteMapping("/deleteStockAttest")
	public String deleteStockAttestService(@RequestParam Long id) {
		stockAttestService.deleteStockAttest(id);
		return "deleted successfuly";
		
	}
}
