package com.cg.votingapp.dao;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.ReqNotFoundException;
import com.cg.votingapp.entity.VoterIdEntity;

import com.cg.votingapp.exceptions.UserNotFoundException;

public class VoterIdDAOImpl implements VoterIdDAO{
	private static Logger logger = LogManager.getLogger(VoterIdDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public String findByUserId(int user_id) throws UserNotFoundException {
	 String current_status="";
	 VoterIdEntity voterIdObj=entityManager.find(VoterIdEntity.class, user_id);
	 
	 if(voterIdObj==null)
	 {
	 	throw new UserNotFoundException("user id: "+user_id);//Exception
	 	
	 }
	 else if(voterIdObj.getApplication_status().toUpperCase().equals("APPROVED"))
	 	{
	 		current_status="Application Approved!";
	 		logger.info("Database returned VoterIdEntity: " + voterIdObj);//logger
	 	}
	 	else if(voterIdObj.getApplication_status().toUpperCase().equals("REJECTED"))
	 	{
	 		current_status="Application Rejected!";
	 	}
	 	else
	 	{
	 		current_status="Application Pending";
	 	}
	 
	 return current_status;
	
	}

	public String findByReqId(int request_id) throws ReqNotFoundException {
		String current_status="";
		 VoterIdEntity voterIdObj=entityManager.find(VoterIdEntity.class, request_id);
		 
		 if(voterIdObj==null)
		 {
		 	throw new ReqNotFoundException("user id: "+request_id);//Exception
		 	
		 }
		 else if(voterIdObj.getApplication_status().toUpperCase().equals("APPROVED"))
		 	{
		 		current_status="Application Approved!";
		 		logger.info("Database returned VoterIdEntity: " + voterIdObj);//logger
		 	}
		 	else if(voterIdObj.getApplication_status().toUpperCase().equals("REJECTED"))
		 	{
		 		current_status="Application Rejected!";
		 	}
		 	else
		 	{
		 		current_status="Application Pending";
		 	}
		 
		 return current_status;
		
	}



	}
