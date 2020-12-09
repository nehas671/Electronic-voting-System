package com.cg.votingapp.dao;

import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VoterRequestDAOImpl implements VoterRequestDAO {
	
	private static Logger logger = LogManager.getLogger(VoterRequestDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public VoterRequestEntity addVoterRequest(VoterRequestEntity entity){
	
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("User with Id" + entity.getUserId()+ "is added");
		return entity;
	}

	public VoterRequestEntity viewVoterRequest(String constituency) throws RecordNotFoundException {
		VoterRequestEntity entity = entityManager.find(VoterRequestEntity.class, constituency);
		Query query = (Query) entityManager.createQuery("SELECT vr from VoterRequestEntity vr");
		@SuppressWarnings("unchecked")
		List<VoterRequestEntity> list = (List<VoterRequestEntity>)((javax.persistence.Query) query).getResultList();
	    logger.info("Candidate List");
		for(VoterRequestEntity vr: list) {
			System.out.println(vr);
		}
		if(entity==null)
		{
			throw new RecordNotFoundException("Records not found");
		}
		return entity;
	}

	}
	
