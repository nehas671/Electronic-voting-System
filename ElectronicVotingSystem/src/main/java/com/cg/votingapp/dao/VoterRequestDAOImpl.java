package com.cg.votingapp.dao;

import com.cg.votingapp.entity.VoterIdEntity;
import com.cg.votingapp.entity.VoterRequestEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
	
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("User with Id" + entity.getUser_id()+ "is added");
		return entity;
	}
	
	public VoterRequestEntity checkById(int userId) throws NullValueFoundException {
		VoterRequestEntity voterRequestEntity = entityManager.find(VoterRequestEntity.class, userId);
		logger.info("Checking user with id: " + voterRequestEntity);
		if(voterRequestEntity==null)
			throw new NullValueFoundException("Voter Request Id: " + userId);
		return voterRequestEntity;
	}
	
	public VoterRequestEntity checkByName(String userName) throws NullValueFoundException {
		String jpql = "SELECT voterRequest FROM VoterRequestEntity voterRequest where voterRequest.voterRequest_name=:pname";
		TypedQuery<VoterRequestEntity> query = entityManager.createQuery(jpql, VoterRequestEntity.class);
		query.setParameter("pname", userName);
		query.setMaxResults(1);
		VoterRequestEntity entity = query.getSingleResult();
		if (entity == null) {
			throw new NullValueFoundException("Not found");
		}
		return entity;
	}
	
	public VoterRequestEntity viewVoterRequest(int user_id) throws RecordNotFoundException {
		VoterRequestEntity entity = entityManager.find(VoterRequestEntity.class, user_id);
		Query query = entityManager.createQuery("SELECT v from VoterRequestEntity v");
		@SuppressWarnings("unchecked")
		List<VoterRequestEntity> list = (List<VoterRequestEntity>)query.getResultList();
	    logger.info("Voter Request List");
		for(VoterRequestEntity v: list) {
			System.out.println(v);
		}
		if(entity==null)
		{
			throw new RecordNotFoundException("User Id"+user_id);
		}
		return entity;
	}
}
