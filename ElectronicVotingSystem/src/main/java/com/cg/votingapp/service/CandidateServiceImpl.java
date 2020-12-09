package com.cg.votingapp.service;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.CandidateDAO;
import com.cg.votingapp.dao.CandidateDAOImpl;
import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.presentation.CandidateController;
import com.cg.votingapp.utils.VotingAppUtils;

public class CandidateServiceImpl implements CandidateService {

	private static Logger logger = LogManager.getLogger(CandidateServiceImpl.class.getName());
	CandidateDAO candidateDAO = new CandidateDAOImpl();

	public Candidate addCandidate(Candidate candidate)
	{
		CandidateEntity candidateEntity = candidateDAO.addCandidate(VotingAppUtils.convertCandidateIntoCandidateEntity(candidate));
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}
	
	public Candidate checkId(int candidateId) throws NullValueFoundException {
		CandidateEntity candidateEntity = candidateDAO.checkId(candidateId);
		logger.info("ItemEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}
	
	public Candidate checkName(String candidateName) throws NullValueFoundException {
		CandidateEntity candidateEntity = candidateDAO.checkName(candidateName);
		logger.info("ItemEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);
	}
	
	public Candidate viewCandidate(int candidate_id) throws RecordNotFoundException{
		CandidateEntity candidateEntity = candidateDAO.viewCandidate(candidate_id);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
	
	public Candidate updateCandidateName(String candidate_id, String candidate_name) throws NullValueFoundException {
		CandidateEntity candidateEntity = candidateDAO.updateCandidateName(candidate_id, candidate_name);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
	
	public Candidate updateAddress(String candidate_id, String address) throws NullValueFoundException {
		CandidateEntity candidateEntity = candidateDAO.updateAddress(candidate_id, address);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
	
	public Candidate updateAge(String candidate_id, int age) throws NullValueFoundException {
		CandidateEntity candidateEntity = candidateDAO.updateAge(candidate_id, age);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		

	}
	
	public Candidate updateContactDetails(String candidate_id, int contact_details) {
		CandidateEntity candidateEntity = candidateDAO.updateContactDetails(candidate_id, contact_details);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}


	

}
