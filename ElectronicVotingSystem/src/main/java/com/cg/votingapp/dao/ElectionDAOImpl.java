package com.cg.votingapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.InvalidStateException;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.ElectionServiceImpl;




public class ElectionDAOImpl implements ElectionDAO {

	private static Logger logger = LogManager.getLogger(ElectionDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
		
		/*String[] statearray = {"Andhra Pradesh","Arunachal Pradesh","Assam","Chhattisgarh","Goa","Gujarat","Haryana",
				"Himachal Pradesh","Mizoram","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
				"Nagaland","Odisha","Punjab","Rajasthan","Sikkim","TamilNadu","Tripura"};*/
		
	}
	
	
	
	
	
	
	public void addElection(ElectionEntity entity) throws InvalidStateException{
		
		ArrayList<String> statelists = new ArrayList<String>();
		statelists.addAll(Arrays.asList("AndhraPradesh","ArunachalPradesh","Assam","Chhattisgarh","Goa","Gujarat","Haryana",
				"Himachal Pradesh","Mizoram","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
				"Nagaland","Odisha","Punjab","Rajasthan","Sikkim","TamilNadu","Tripura"));
		if(statelists.contains(entity.getState()))
		{
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
		logger.info("Election data inserted successfully");
		
		}else
		{
			throw new InvalidStateException();
		}
		
	}


	public ElectionEntity findById(int ElectionId) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		ElectionEntity electionEntity = entityManager.find(ElectionEntity.class, ElectionId);
		logger.info("Database returned ItemEntity: " + electionEntity);
		if(electionEntity==null)
			throw new RecordNotFoundException("ItemId: " + ElectionId);
		return electionEntity ;
	}

	
	
	
	

	public boolean viewElection() {
	
		Query query = entityManager.createQuery("SELECT ct from ElectionEntity ct");
		
		List<ElectionEntity> ElectionList = query.getResultList();
		for(ElectionEntity employee: ElectionList) {
			
			logger.info("each election"+employee);
		}
		return true;
	}


	public boolean viewElectionById(int election_id) throws  NullValueFoundException {
		
		
		ElectionEntity electionEntity = entityManager.find(ElectionEntity.class, election_id);
		//logger.info("Database returned ItemEntity: " + electionEntity);
		if(electionEntity==null)
			throw new NullValueFoundException("Election Id: " + election_id);
		else
			logger.info("Election details for "+" election_id "+electionEntity);
		
		return true;
	}
	
	


	/*@Override
	public Boolean validateState() {
		// TODO Auto-generated method stub
		ArrayList<String> statelist = new ArrayList<String>();
		return true;
	}*/


	
	
	


	


	
	
	
}