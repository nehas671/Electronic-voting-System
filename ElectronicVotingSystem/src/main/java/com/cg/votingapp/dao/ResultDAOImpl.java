package com.cg.votingapp.dao;
import com.cg.votingapp.entity.*;

import java.util.Date;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




import com.cg.votingapp.entity.*;


import com.cg.votingapp.exceptions.*;
public class ResultDAOImpl  implements ResultDAO
{
	private static Logger logger = LogManager.getLogger(ResultDAOImpl.class.getName());	
	private static EntityManager entityManager;
	static  //entry point
	{
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("VotingAppPU");   
		entityManager=entityManagerFactory.createEntityManager();		
	}
	
	public String declareResult() throws ResultNotFoundException  // Method to fetch result
	{
		String message="";
		ResultEntity result=null;
		Query query = entityManager.createQuery("SELECT  election.election_id, election.state, election.date, candidate.candidate_id,"  
				+ " candidate.candidate_name, candidate.party_name, candidate.count"
				+ " FROM CandidateEntity candidate JOIN PartyEntity party on candidate.party_name=party.party_name "
				+ "Join ElectionPartyEntity electionparty on party.party_name =electionparty.party_name "
				+ "Join ElectionEntity election on electionparty.election_id=election.election_id "
				+ "order by candidate.count desc" ); //join condition to fetch result data from multiple tables 
		
		if(query==null)
		{
			throw new ResultNotFoundException("Not found");    //if no result data found throw ResultNotFoundException
		
		}
		else
		{
			List<Object[]> list = query.getResultList();      //Creating Object array
			for (Object[] obj : list) 
			{
				int election_id=(Integer) obj[0];            //Converting from Object type to Corresponding type of data
				String state=(String)obj[1];
				String date=(String)obj[2];
				int candidate_id=(Integer)obj[3];
				String candidate_name=(String)obj[4];
				String party_name=(String)obj[5];
				int vote_count=(Integer)obj[6];
				result=new ResultEntity(election_id,state,date,candidate_id,candidate_name,party_name,vote_count);	  //Storing result data into ResultEntity
				entityManager.getTransaction().begin();
				entityManager.merge(result);  				// adding result data into ResultEntity
				entityManager.getTransaction().commit();				
			}
			return "inserted Succesfully";
		}
	}
	
	public ResultEntity findByResultId(int result_id) throws ResultNotFoundException 
	{		
		ResultEntity resultEntity = entityManager.find(ResultEntity.class, result_id); // finding resultid from ResultEntity
		logger.info("Database returned ResultEntity: " + resultEntity);
		if(resultEntity==null)
			throw new ResultNotFoundException("ResultId: " + result_id);			//if no match found throw ResultNotFoundException
			return resultEntity ;
	}	
}
