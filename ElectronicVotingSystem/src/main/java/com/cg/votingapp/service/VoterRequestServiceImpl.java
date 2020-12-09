package com.cg.votingapp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.dao.VoterRequestDAO;
import com.cg.votingapp.dao.VoterRequestDAOImpl;
import com.cg.votingapp.dto.VoterRequest;
import com.cg.votingapp.entity.VoterRequestEntity;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VoterRequestServiceImpl implements VoterRequestService {
	
	private static Logger logger = LogManager.getLogger(VoterRequestServiceImpl.class.getName());	
	VoterRequestDAO voterRequestDAO = new VoterRequestDAOImpl();
	public VoterRequestEntity addVoterRequest(VoterRequestEntity voterRequestEntity) {
		// TODO Auto-generated method stub
		return null;
	}
	public VoterRequestEntity checkById(int userId) throws NullValueFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	public VoterRequestEntity checkByName(String userName) throws NullValueFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	/*public VoterRequestEntity addVoterRequest(VoterRequestEntity voterRequestEntity) {
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("User with Id" + entity.getUser_id()+ "is added");
		return entity;
	}

	public VoterRequestEntity checkById(int userId) throws NullValueFoundException {
		VoterRequest voterRequest = voterRequest.find(VoterRequest.class, userId);
		logger.info("Checking user with id: " + voterRequest);
		if(voterRequestEntity==null)
			throw new NullValueFoundException("Voter Request Id: " + userId);
		return voterRequest;
	}

	public VoterRequestEntity checkByName(String userName) throws NullValueFoundException {
		String jpql = "SELECT voterRequest FROM VoterRequestEntity voterRequest where voterRequest.voterRequest_name=:pname";
		TypedQuery<VoterRequest> query = entityManager.createQuery(jpql, VoterRequest.class);
		query.setParameter("pname", userName);
		query.setMaxResults(1);
		VoterRequest entity = query.getSingleResult();
		if (entity == null) {
			throw new NullValueFoundException("Not found");
		}
		return entity;
	}

	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		VoterRequest entity = entityManager.find(VoterRequest.class, user_id);
		Query query = entityManager.createQuery("SELECT v from VoterRequest v");
		@SuppressWarnings("unchecked")
		List<VoterRequest> list = (List<VoterRequest>)query.getResultList();
	    logger.info("Voter Request List");
		for(VoterRequest v: list) {
			System.out.println(v);
		}
		if(entity==null)
		{
			throw new RecordNotFoundException("User Id"+user_id);
		}
		return entity;
	}*/

}
