package org.sid.services;

import java.util.List;

import org.sid.interfaces.ClientInterface;
import org.sid.model.Client;
import org.sid.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ClientAssuranceService implements ClientInterface{
	@Autowired
	private ClientRepository clientRepo;
	
	@Override
	public Client saveClient(Client client) {
		return clientRepo.save(client);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepo.save(client);
	}

	@Override
	public List<Client> findAllClients() {
		// TODO Auto-generated method stub
		return  clientRepo.findAll();
	}

	@Override
	public void deleteClient(Long id) {
		// TODO Auto-generated method stub
		clientRepo.deleteById(id);
	}
	
}
