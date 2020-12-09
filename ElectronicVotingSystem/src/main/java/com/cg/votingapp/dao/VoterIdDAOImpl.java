package com.cg.votingapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.entity.VoterIdEntity;

import com.cg.votingapp.exceptions.UserNotFoundException;

public class VoterIdDAOImpl implements VoterIdDAO{
	private static Logger logger = LogManager.getLogger(VoterIdDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingApp");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public VoterIdEntity findByUserId(int user_id) throws UserNotFoundException {
		VoterIdEntity VoterIdEntity = entityManager.find(VoterIdEntity.class, user_id);
		logger.info("Database returned VoterIdEntity: " + VoterIdEntity);
		if(VoterIdEntity==null)
			throw new UserNotFoundException("userId: " + user_id);
		return VoterIdEntity;
	}

	public VoterIdEntity findByReqId(int request_id) throws ReqNotFoundException {
		VoterIdEntity VoterIdEntity = entityManager.find(VoterIdEntity.class, request_id);
		logger.info("Database returned VoterIdEntity: " + VoterIdEntity);
		if(VoterIdEntity==null)
			throw new ReqNotFoundException("Request id: " + request_id);
		return VoterIdEntity;
	}


}
