package com.releve.planification.services;

import java.util.List;

import com.releve.planification.entities.Client;

public interface ClientService {
	public void AddClient(Client client);
	public Client getCientById(int id);
	public List<Client> getClients();

}
