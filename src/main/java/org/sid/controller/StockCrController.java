package org.sid.controller;

import java.util.List;

import org.sid.model.StockCr;
import org.sid.services.StockCrService;
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
@RequestMapping("/stockCr")
public class StockCrController {
	@Autowired
	private StockCrService stockCrRepo;
	
	@PostMapping("/saveStockCr")
	public StockCr saveStockCr(@RequestBody StockCr stockCr) {
		stockCrRepo.saveStockCr(stockCr);
		return stockCr;
	}
	@PutMapping("/updateStockCr")
	public StockCr updateStockCr(@RequestBody StockCr stockCr) {
		stockCrRepo.saveStockCr(stockCr);
		return stockCr;
	}
	@GetMapping("/getAllStockCr")
	public List<StockCr> findAllStockCr(){
		return stockCrRepo.findAllStockCrs();	
	}
	@DeleteMapping("/deleteStockCr")
	public String deleteStockCr(@RequestParam Long id) {
		stockCrRepo.deleteStockCr(id);
		return "deleted success";
		
	}
	
}
