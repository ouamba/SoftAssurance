package org.sid.interfaces;

import java.util.List;

import org.sid.model.StockCr;

public interface StockCrInterface {
	//to save StockCr
	public StockCr saveStockCr(StockCr stockCr);
	
	//to updateStockCr
	public StockCr updateStockCr(StockCr stockCr);
	
	//to fecth all StockCr
	public List<StockCr> findAllStockCrs();
	
	//to delete StockCr
	public void deleteStockCr(Long id);

}
