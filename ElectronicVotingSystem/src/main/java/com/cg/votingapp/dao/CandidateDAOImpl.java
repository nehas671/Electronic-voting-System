package com.cg.votingapp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.CandidateServiceImpl;


public class CandidateDAOImpl implements CandidateDAO {

	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	/*
	 * This method adds entity to Candidate table
	 */
	
	public CandidateEntity addCandidate(CandidateEntity entity){
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		entityManager.close();
		logger.info("Candidate with Id" + entity.getCandidate_id()+ "is added");
		return entity;
	}
	
	public CandidateEntity checkId(int candidateId) throws NullValueFoundException {
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateId);
		logger.info("Checking candidate with id CandidateEntity: " + candidateEntity);
		if(candidateEntity==null)
			throw new NullValueFoundException("CandidateId: " + candidateId);
		return candidateEntity;
	}
	
/*	public List<CandidateEntity> viewCandidate(){
        entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("Select c from CandidateEntity c");
		@SuppressWarnings("unchecked")
		List<CandidateEntity> list=(List<CandidateEntity>)query.getResultList();
		//entityManager.getTransaction().commit();
		logger.info("Candidate is displayed");
		return list;			
	}*/
	//entityManagerFactory.close();
}


