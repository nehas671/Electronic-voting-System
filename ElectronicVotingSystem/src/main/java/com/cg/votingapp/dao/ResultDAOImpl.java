package com.cg.votingapp.dao;

import java.util.Date;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.entity.*;
import com.cg.VotingApp.exceptions.ResultNotFoundException;






public class ResultDAOImpl  implements ResultDAO{
	private static Logger logger = LogManager.getLogger(ResultDAOImpl.class.getName());	
	
	
	private static EntityManager entityManager;

	 static
	
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager=entityManagerFactory.createEntityManager();
		
		
		}
	
	public void declareResult()  {
		
		ResultEntity result=null;
		Query query = entityManager.createQuery("SELECT  election.election_id, election.state, election.date, candidate.candidate_id,"
				+ " candidate.candidate_name, candidate.party_name, candidate.count"
				+ " FROM CandidateEntity candidate JOIN PartyEntity party on candidate.party_name=party.party_name "
				+ "Join ElectionPartyEntity electionparty on party.party_name =electionparty.party_name "
				+ "Join ElectionEntity election on electionparty.election_id=election.election_id "
				+ "order by candidate.count desc" ); 
		
		List<Object[]> list = query.getResultList();
	for (Object[] obj : list) {
		    String election_id=(String) obj[0];
		    String state=(String)obj[1];
		    Date date=(Date)obj[2];
		    int candidate_id=(Integer)obj[3];
		    String candidate_name=(String)obj[4];
		    String party_name=(String)obj[5];
		    int vote_count=(Integer)obj[6];
		    
		   
		    result=new ResultEntity(election_id,state,date,candidate_id,candidate_name,party_name,vote_count);
		  
		    entityManager.getTransaction().begin();
			entityManager.persist(result);
			entityManager.getTransaction().commit();		    
		}
		
		System.out.println("inserted succesfully");
	}
}
