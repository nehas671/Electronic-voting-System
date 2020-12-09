package com.cg.votingapp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.CandidatesEntity;
import com.cg.votingapp.exceptions.CandidateNotFoundException;

public class ElectionCastVoteDAOImpl implements ElectionCastVoteDAO
{
	
	private static Logger logger=LogManager.getLogger(ElectionCastVoteDAOImpl.class.getName());
	private static EntityManager entityManager;
	
	static
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager=entityManagerFactory.createEntityManager();
	}
	
	//Cast Vote function
	public Boolean castVote(int candidateId) throws CandidateNotFoundException
	{	
		boolean voted=false;
		entityManager.getTransaction().begin();
		
		//Find candidate with candidateId in Candidate Table
		CandidatesEntity candidateObj=entityManager.find(CandidatesEntity.class, candidateId);
		
		logger.info("Database returned CandidateEntity: " + candidateObj);
		if(candidateObj==null)
		{
			throw new CandidateNotFoundException("CandidateID: "+candidateId);
		}
		else
		{
			//Update Vote Count
			int voteCount=candidateObj.getVote_count();
			candidateObj.setVote_count(voteCount+1);
			voted=true;		
		}
		entityManager.getTransaction().commit();
		return voted; //return whether voter voted or not
	}
}
