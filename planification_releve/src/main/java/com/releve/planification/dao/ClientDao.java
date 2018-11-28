package com.releve.planification.dao;

import java.util.List;

import com.releve.planification.entities.Client;

public interface ClientDao {

	public void AddClient(Client client);
	public Client getCientById(int id);
	public List<Client> getClients();
}
