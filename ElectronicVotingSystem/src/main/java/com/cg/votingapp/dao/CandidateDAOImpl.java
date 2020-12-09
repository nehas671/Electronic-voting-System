package com.cg.votingapp.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.VotingApp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.CandidateServiceImpl;
import com.cg.votingapp.entity.PartyEntity;

import java.util.List;


public class CandidateDAOImpl implements CandidateDAO {

	private static Logger logger = LogManager.getLogger(CandidateDAOImpl.class.getName());	
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	/*
	 * This method adds entity to Candidate table
	 */
	
	public CandidateEntity addCandidate(CandidateEntity entity){
		PartyEntity party =new PartyEntity("BJP", "PM", "Lotus");
		entity.setParty(party);
		entityManager.getTransaction().begin();
		entityManager.merge(entity);
		entityManager.getTransaction().commit();
		logger.info("Candidate with Id" + entity.getCandidate_id()+ "is added");
		return entity;
	}
	
	public CandidateEntity checkId(int candidateId) throws NullValueFoundException {
		CandidateEntity candidateEntity = entityManager.find(CandidateEntity.class, candidateId);
		logger.info("Checking candidate with id: " + candidateEntity);
		if(candidateEntity==null)
			throw new NullValueFoundException("CandidateId: " + candidateId);
		return candidateEntity;
	}
	
	public CandidateEntity checkName(String candidateName) throws NullValueFoundException {
		String jpql = "SELECT candidate FROM CandidateEntity candidate where candidate.candidate_name=:pname";
		TypedQuery<CandidateEntity> query = entityManager.createQuery(jpql, CandidateEntity.class);
		query.setParameter("pname", candidateName);
		query.setMaxResults(1);
		CandidateEntity entity = query.getSingleResult();
		if (entity == null) {
			throw new NullValueFoundException("faculty not found");
		}
		return entity;
	}

	
	public CandidateEntity viewCandidate(int candidate_id) throws RecordNotFoundException {
		CandidateEntity entity = entityManager.find(CandidateEntity.class, candidate_id);
		Query query = entityManager.createQuery("SELECT c from CandidateEntity c");
		@SuppressWarnings("unchecked")
		List<CandidateEntity> list = (List<CandidateEntity>)query.getResultList();
	    logger.info("Candidate List");
		for(CandidateEntity c: list) {
			System.out.println(c);
		}
		if(entity==null)
		{
			throw new RecordNotFoundException("CandidateId"+candidate_id);
		}
		return entity;
	}
	
	public CandidateEntity updateCandidateName(String candidate_id, String candidate_name) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		Candidate candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setCandidate_name(candidate_name);
		entityManager.getTransaction().commit();
		System.out.println("Contact updated succssfully!!");
	}
	
	public CandidateEntity updateAddress(String candidate_id, String address) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		Candidate candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setAddress(address);
		entityManager.getTransaction().commit();
		System.out.println("Address updated succssfully!!");
	}
	
	public CandidateEntity updateAge(String candidate_id, int age) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		Candidate candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setAge(age);
		entityManager.getTransaction().commit();
		System.out.println("Contact updated succssfully!!");
	}
	
	public CandidateEntity updateContactDetails(String candidate_id, int contact_details) {
		entityManager.getTransaction().begin();
		Candidate candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setContactDetails(contact_details);
		entityManager.getTransaction().commit();
		System.out.println("Contact updated succssfully!!");
	}
}


