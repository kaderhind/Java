package com.releve.planification.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.releve.planification.dao.AgentDao;
import com.releve.planification.entities.Agent;

@Repository
public class AgentDaoImp implements AgentDao {

	@PersistenceContext(unitName = "entityManager")
	EntityManager entityManager;
	@Override
	public List<Agent> getAllAgents() {
		List<Agent> agents=entityManager.createQuery("select a from gt_agents_rf",Agent.class).getResultList();
		return agents;
	}

}
