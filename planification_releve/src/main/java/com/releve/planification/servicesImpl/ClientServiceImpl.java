package com.releve.planification.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.releve.planification.dao.ClientDao;
import com.releve.planification.entities.Client;
import com.releve.planification.services.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientDao clientDao;
	@Override
	public void AddClient(Client client) {
			clientDao.AddClient(client);
	}

	@Override
	public Client getCientById(int id) {
		
		return clientDao.getCientById(id);
	}

	@Override
	public List<Client> getClients() {
		return clientDao.getClients();
	}

}
