package com.cg.votingapp.service;


import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.cg.votingapp.dao.UpdateCandidateDAOImpl;
import com.cg.votingapp.dao.UpdateCandidateDao;
import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.utils.VotingAppUtils;

public class UpdateCandiateServiceImpl implements UpdateCandidateService{
	
	private static Logger logger;
	UpdateCandidateDao updateCandidateDao = new UpdateCandidateDAOImpl();

	
	public Candidate updateCandidateName(int candidate_id, String candidate_name) throws NullValueFoundException {
		CandidateEntity candidateEntity = updateCandidateDao.updateCandidateName(candidate_id, candidate_name);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
	
	public Candidate updateAddress(int candidate_id, String address) throws NullValueFoundException {
		CandidateEntity candidateEntity = updateCandidateDao.updateAddress(candidate_id, address);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
	
	public Candidate updateAge(int candidate_id, int age) throws NullValueFoundException {
		CandidateEntity candidateEntity = updateCandidateDao.updateAge(candidate_id, age);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		

	}
	
	public Candidate updateContactDetails(int candidate_id, long contact_details) throws NullValueFoundException{
		CandidateEntity candidateEntity = updateCandidateDao.updateContactDetails(candidate_id, contact_details);
		logger.info("CandidateEntity: " + candidateEntity);
		return VotingAppUtils.convertCandidateEntityIntoCandidate(candidateEntity);		
	}
}
