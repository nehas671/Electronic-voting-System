package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.exceptions.InsertQueryException;

public class RegisterUserDAOImpl implements RegisterUserDAO {
	private static Logger logger = LogManager.getLogger(RegisterUserDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public void addUser(RegisterUser entity) throws InsertQueryException{
	entityManager.getTransaction() .commit();
	
	entityManager.merge(entity);
	
	entityManager.getTransaction().commit();
	
	logger.info("data inserted successfully");
	
	}
}
