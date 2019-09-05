package org.sid.interfaces;

import java.util.List;

import org.sid.model.Client;

public interface ClientInterface {
	//to save a new Client
	public Client saveClient(Client client);
	
	//to update student
	public Client updateClient(Client client);
	
	//to fetch all client from database
	public List<Client> findAllClients();
	
	//to delete Client
	public void deleteClient(Long id);
}
