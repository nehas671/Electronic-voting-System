package com.cg.votingapp.dao;

import java.util.logging.LogManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;

public class UpdateCandidateDAOImpl implements UpdateCandidateDao {
	private static Logger logger ;
	private static EntityManager entityManager;
	
	static {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("VotingAppPU");
		entityManager = entityManagerFactory.createEntityManager();
	}

	public CandidateEntity updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		CandidateEntity candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setCandidate_name(candidate_name);
		entityManager.getTransaction().commit();
		System.out.println("Contact updated succssfully!!");
		return candidateObj;
	}
	
	public CandidateEntity updateAddress(int candidate_id, String address) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		CandidateEntity candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setAddress(address);
		entityManager.getTransaction().commit();
		System.out.println("Address updated succssfully!!");
		return candidateObj;
	}
	
	public CandidateEntity updateAge(int candidate_id, int age) throws NullValueFoundException {
		entityManager.getTransaction().begin();
		CandidateEntity candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setAge(age);
		entityManager.getTransaction().commit();
		System.out.println("Age updated succssfully!!");
		return candidateObj;
	}
	
	public CandidateEntity updateContactDetails(int candidate_id, long contact_details) {
		entityManager.getTransaction().begin();
		CandidateEntity candidateObj = entityManager.find(CandidateEntity.class, candidate_id);	
		candidateObj.setContact_details(contact_details);
		entityManager.getTransaction().commit();
		System.out.println("Contact updated succssfully!!");
		return candidateObj;
	}
}
