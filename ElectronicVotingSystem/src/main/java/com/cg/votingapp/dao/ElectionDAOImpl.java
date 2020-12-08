package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;
import com.cg.VotingApp.exception.ItemNotFoundException;
import com.cg.VotingApp.service.ElectionServiceImpl;


public class ElectionDAOImpl implements ElectionDAO {

	private static Logger logger = LogManager.getLogger(ElectionDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public void addElection(ElectionEntity entity){
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
		logger.info("Election data inserted successfully");
		
	}


	public ElectionEntity findById(int ElectionId) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		ElectionEntity electionEntity = entityManager.find(ElectionEntity.class, ElectionId);
		logger.info("Database returned ItemEntity: " + electionEntity);
		if(electionEntity==null)
			throw new ItemNotFoundException("ItemId: " + ElectionId);
		return electionEntity ;
	}
	
	


	


	
	
	
}