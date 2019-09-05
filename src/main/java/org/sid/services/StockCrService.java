package org.sid.services;

import java.util.List;

import org.sid.interfaces.StockCrInterface;
import org.sid.model.StockCr;
import org.sid.repository.StockCrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StockCrService implements StockCrInterface{
	@Autowired
	private StockCrRepository stockCrRepo;
	@Override
	public StockCr saveStockCr(StockCr stockCr) {
		// TODO Auto-generated method stub
		return stockCrRepo.save(stockCr);
	}

	@Override
	public StockCr updateStockCr(StockCr stockCr) {
		// TODO Auto-generated method stub
		return stockCrRepo.save(stockCr);
	}

	@Override
	public List<StockCr> findAllStockCrs() {
		// TODO Auto-generated method stub
		return stockCrRepo.findAll();
	}

	@Override
	public void deleteStockCr(Long id) {
		// TODO Auto-generated method stub
		stockCrRepo.deleteById(id);
	}

}
