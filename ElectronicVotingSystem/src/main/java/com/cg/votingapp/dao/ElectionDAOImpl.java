package com.cg.votingapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Election;
import com.cg.votingapp.entity.ElectionEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.ElectionServiceImpl;




public class ElectionDAOImpl implements ElectionDAO {

	private static Logger logger = LogManager.getLogger(ElectionDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public void addElection(ElectionEntity entity){
		
		entityManager.getTransaction().begin();
		
		entityManager.merge(entity);
		
		entityManager.getTransaction().commit();
		logger.info("Election data inserted successfully");
		
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
	
		Query query = entityManager.createQuery("SELECT ct from Election ct");
		
		List<ElectionEntity> ElectionList = query.getResultList();
		for(ElectionEntity employee: ElectionList) {
			System.out.println(employee);
		}
		return true;
	}
	
	


	/*@Override
	public Boolean validateState() {
		// TODO Auto-generated method stub
		ArrayList<String> statelist = new ArrayList<String>();
		return true;
	}*/


	
	
	


	


	
	
	
}