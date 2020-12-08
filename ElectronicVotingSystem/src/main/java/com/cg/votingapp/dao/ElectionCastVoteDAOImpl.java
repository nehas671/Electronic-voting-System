package com.cg.votingapp.dao;


import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	public void castVote() throws CandidateNotFoundException
	{
		//JQPL Query to get candidate list with specific attributes
		Scanner sc=new Scanner(System.in);
		Query query=entityManager.createQuery("Select c.candidate_id, c.candidate_name c.party_name, c.vote_count FROM Candidate c JOIN Party p on c.party_name=p.party_name JOIN Election_Party ps on p.party_name=ps.party_name JOIN Election e on ps.election_id=e.election_id order by c.candidate_id");
		
		List<Object[]>list=query.getResultList();
		list.forEach(l->System.out.println("Candidate:"+Arrays.toString(l))); //Print list of candidates
		
		System.out.println("Enter CandidateID to vote for Candidate: ");
		int candidateId=sc.nextInt();
		
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
		}
		entityManager.getTransaction().commit();
		
		sc.close();
	}

}
