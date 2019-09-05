package org.sid.services;

import java.util.List;

import org.sid.interfaces.StockAttestInterface;
import org.sid.model.StockAttest;
import org.sid.repository.StockAttestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockAttestService implements StockAttestInterface{
	@Autowired
	private StockAttestRepository stockAttestRepo;
	@Override
	public StockAttest saveStockAttest(StockAttest stockAttest) {
		return stockAttestRepo.save(stockAttest);
	}

	@Override
	public StockAttest updateStockAttest(StockAttest stockAttest) {
		return stockAttestRepo.save(stockAttest);
	}

	@Override
	public List<StockAttest> findAllStockAttests() {
		return stockAttestRepo.findAll();
	}

	@Override
	public void deleteStockAttest(Long id) {
		// TODO Auto-generated method stub
		stockAttestRepo.deleteById(id);
	}
	

}
