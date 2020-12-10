package com.cg.votingapp.dao;

import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.RegisterUser;
import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import javax.persistence.Query;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VoterRequestDAOImpl implements VoterRequestDAO {
	
	private static Logger logger = LogManager.getLogger(VoterRequestDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	public VoterRequestEntity addVoterRequest(VoterRequestEntity entity){
		if(entity.getApplicationStatus()=="Approved") {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("User with Id" + entity.getUser_id()+ "is added");}
		else {
			System.out.println("Request is not Approved");
		}
		return entity;
	}

	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		VoterRequestEntity entity = entityManager.find(VoterRequestEntity.class, user_id);
		Query query = (Query) entityManager.createQuery("SELECT vr from VoterRequestEntity vr");
		@SuppressWarnings("unchecked")
		List<VoterRequestEntity> list = (List<VoterRequestEntity>) query.getResultList();
		logger.info("VoterRequest List");
		for(VoterRequestEntity vr : list) {
			System.out.println(vr);
		}
		if (entity == null) {
			throw new RecordNotFoundException("No Users found");
		}
		return entity;
		
	}
	public VoterRequestEntity approveVoterRequest(int user_id) {
		int result = 0;
		VoterRequestEntity voterRequestEntity = new VoterRequestEntity();
		RegisterUser register = new RegisterUser();
		Query query = entityManager.createQuery("Select vr FROM VoterRequestEntity vr WHERE vr.user_id =:user_id");
		result = query.getFirstResult();
		if(result==0) {
			System.out.println("Request Approved");
			voterRequestEntity.setApplicationStatus("Approved");
			return voterRequestEntity;
		}
		else {
			System.out.println("Request Rejected");
			voterRequestEntity.setApplicationStatus("Rejected");
			return voterRequestEntity;
		}
	}

	}
	
