package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.NullValueFoundException;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.CandidateService;
import com.cg.votingapp.service.CandidateServiceImpl;

public class VoterRequestController {
	private static Logger logger = LogManager.getLogger(CandidateController.class.getName());
	CandidateService candidateService = new CandidateServiceImpl();
	
	public VoterRequest addVoterRequest(VoterRequest voterrequest)
	{
		logger.info("Adding user");
		Voterrequest v =voterrequestService.addVoterRequest(VoterRequest);
	    return v;
	}
	
	public VoterRequest checkId(int userId) throws NullValueFoundException {
		logger.info("Checking user for id: " + userId);
		VoterRequest voterRequest = null;
		try {
			voterRequest = voterRequestService.checkId(userId);
		}
		catch(NullValueFoundException e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return voterRequest;
	}
	
	public VoterRequest checkName(String userName) throws NullValueFoundException {
		logger.info("Checking user for name: " + userName);
		VoterRequest voterRequest = null;
		try {
			voterRequest = voterRequestService.checkName(userName);
		}
		catch(NullValueFoundException e) {
			logger.error("NullValueFoundException: " + e);
			throw new NullValueFoundException(e.getMessage());
		}
		return voterRequest;
	}
	
	public Candidate viewVoterRequest(int user_id) throws RecordNotFoundException{
		logger.info("Viewing VoterRequest List");
		VoterRequest voterRequest= null;
		try {
			voterRequest = voterRequestService.viewVoterRequest(candidate_id);
		}
		catch(Exception e) {
			logger.error("RecordNotFoundException: " + e);
			throw new RecordNotFoundException(e.getMessage());
		}
		return VoterRequest;
    }

}
