package com.cg.VotingApp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.dto.Election;
import com.cg.VotingApp.entity.ElectionEntity;

import com.cg.VotingApp.service.ElectionServiceImpl;

public class ElectionDAOImpl implements ElectionDAO {

	private static Logger logger = LogManager.getLogger(ElectionDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public void addElection(ElectionEntity entity){
		logger.info("Election data begin");
		entityManager.getTransaction().begin();
		logger.info("Election  begin persist");
		entityManager.merge(entity);
		logger.info("Election after persist");
		entityManager.getTransaction().commit();
		logger.info("Election data inserted successfully");
		
	}


	


	
	
	
}
