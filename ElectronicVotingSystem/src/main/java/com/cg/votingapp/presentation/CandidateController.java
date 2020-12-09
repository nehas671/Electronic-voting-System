package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.CandidateService;
import com.cg.votingapp.service.CandidateServiceImpl;

public class CandidateController {
	private static Logger logger = LogManager.getLogger(CandidateController.class.getName());
	CandidateService candidateService = new CandidateServiceImpl();
	
	public Candidate addCandidate(Candidate candidate)
	{
		logger.info("Adding Candidate");
		Candidate c=candidateService.addCandidate(candidate);
	    return c;
	}
	
	public Candidate checkId(int candidateId) throws NullValueFoundException {
		logger.info("Checking candidate for id: " + candidateId);
		Candidate candidate = null;
		try {
			candidate = candidateService.checkId(candidateId);
		}
		catch(NullValueFoundException e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
	}
	
	public Candidate checkName(String candidateName) throws NullValueFoundException {
		logger.info("Checking candidate for name: " + candidateName);
		Candidate candidate = null;
		try {
			candidate = candidateService.checkName(candidateName);
		}
		catch(NullValueFoundException e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return candidate;
	}
	
	public Candidate viewCandidate(int candidate_id) throws RecordNotFoundException{
		logger.info("Viewing Candidate List");
		Candidate candidate= null;
		try {
			candidate = candidateService.viewCandidate(candidate_id);
		}
		catch(Exception e) {
			logger.error("RecordNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return candidate;
    }

}
