package com.cg.votingapp.dao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.entity.CandidatesEntity;
import com.cg.votingapp.entity.ElectionsEntity;
import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;

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
	public Boolean castVote(int electionId,int candidateId) throws CandidateNotFoundException,ElectionNotFoundException, InvalidInputException
	{
		Boolean voted=false;
		
		//Check if electionId is negative, then throw InvalidInputException
		if(electionId<0)
		{
			throw new InvalidInputException("Invalid Input! Election ID cannot be negative!");
		}
		
		//Check if candidateId is negative, then throw InvalidInputException
		else if(candidateId<0)
		{
			throw new InvalidInputException("Invalid Input! CandidateID cannot be negative!");
		}
		
		else
		{
			//Find if election with electionId exists in election table
			ElectionsEntity electionObj=entityManager.find(ElectionsEntity.class, electionId);
			logger.info("Database returned ElectionEntity: " + electionObj);
			//Find if candidate with candidateId exists in candidate table
			CandidatesEntity candidateObj=entityManager.find(CandidatesEntity.class, candidateId);
			logger.info("Database returned CandidateEntity: " + candidateObj);
			
			//If election does not exists
			if(electionObj==null)
			{
				throw new ElectionNotFoundException("ElectionID: "+electionId);
			}
			
			//If candidate does not exists
			else if(candidateObj==null)
			{
				throw new CandidateNotFoundException("CandidateID: "+candidateId);
			}
			else
			{
				entityManager.getTransaction().begin();
				//Query to map the candidates with its party and the elections.
				Query query=entityManager.createQuery("SELECT election.election_id,election.date,candidate.candidate_id, candidate.candidate_name,party.party_name FROM CandidatesEntity candidate JOIN PartysEntity party on candidate.party_name=party.party_name JOIN Election_PartyEntity electionparty on party.party_name=electionparty.party_name JOIN ElectionsEntity election on electionparty.election_id=election.election_id");
				//Storing the result of the query in a list of object array.
				List<Object[]>list=query.getResultList();
				
				//Array to store the ElectionIDs in the list
				Integer [] electionId_array=new Integer[list.size()];
				//Array to store the CandidateIDs in the list
				Integer [] candidateId_array=new Integer[list.size()];
				
				int i=0;
				for(Object[] obj:list)
				{
					Integer election_id=(Integer) obj[0];
					Integer candidate_id=(Integer)obj[2];
					electionId_array[i]=election_id;
					candidateId_array[i]=candidate_id;
					i++;
				}
				
				int count=0;
				for(int size=0;size<electionId_array.length;size++)
				{
					//Check if given candidate is standing in the given election or not
					if(electionId_array[size]==electionId && candidateId_array[size]==candidateId)
					{
						count=1;
						break;
					}
					else
					{
						continue;
					}
				}
				
				if(count==1)
				{
					int voteCount=candidateObj.getCount();
					//Incrementing vote count of candidate with candidateId
					candidateObj.setCount(voteCount+1);
					voted=true;
					logger.info("Vote casted successfully");
				}
				entityManager.getTransaction().commit();
			}
		}
		return voted;
	}
}