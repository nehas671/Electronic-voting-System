package com.cg.votingapp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.CandidatesEntity;
import com.cg.votingapp.exceptions.CandidateNotFoundException;

public class ElectionCastVoteDAOImpl implements ElectionCastVoteDAO{
	
	private static Logger logger=LogManager.getLogger(ElectionCastVoteDAOImpl.class.getName());
	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager=entityManagerFactory.createEntityManager();
	}
	
	public void castVote(int candidateId) throws CandidateNotFoundException
	{	
		entityManager.getTransaction().begin();
		CandidatesEntity candidateObj=entityManager.find(CandidatesEntity.class, candidateId);
		
		logger.info("Database returned CandidateEntity: " + candidateObj);
		if(candidateObj==null)
		{
			throw new CandidateNotFoundException("CandidateID: "+candidateId);
		}
		else
		{
			int voteCount=candidateObj.getVote_count();
			candidateObj.setVote_count(voteCount+1);
			System.out.println("Voted Successfully!");
		}
		entityManager.getTransaction().commit();
		
	}

}
