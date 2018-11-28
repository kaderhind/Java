package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.releve.planification.dao.ClientDao;
import com.releve.planification.entities.Client;

@Repository
@Transactional
public class ClientDaoImpl implements ClientDao {

	@PersistenceContext
	EntityManager entityManger;
	@Override
	public void AddClient(Client client) {
		entityManger.persist(client);
	}

	@Override
	public Client getCientById(int id) {
		Client client=entityManger.find(Client.class, id);
		return client;
	}

	@Override
	public List<Client> getClients() {
		List<Client> clients=entityManger.createQuery("from Client",Client.class).getResultList();
		return clients;
	}

}
