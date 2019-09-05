package org.sid.interfaces;

import java.util.List;

import org.sid.model.Zone;

public interface ZoneInterface {
	// to save a new Zone
	public Zone saveZone(Zone zone);
	
	//to update Zone
	public Zone updateZone(Zone zone);
	
	//to fetch all zone from database
	public List<Zone> findAllZones();
	
	//to delete Zone
	public void deleteZone(Long id);

}
