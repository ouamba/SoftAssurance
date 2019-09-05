package org.sid.interfaces;

import java.util.List;

import org.sid.model.StockAttest;

public interface StockAttestInterface {
	//to create new stockAttest
	public StockAttest saveStockAttest(StockAttest stockAttest);
	
	//to update StockAttest
	public StockAttest updateStockAttest(StockAttest stockAttest);
	
	//to fetch allStockAttest
	public List<StockAttest> findAllStockAttests();
	
	//to delete StockAttest
	public void deleteStockAttest(Long id);

}
