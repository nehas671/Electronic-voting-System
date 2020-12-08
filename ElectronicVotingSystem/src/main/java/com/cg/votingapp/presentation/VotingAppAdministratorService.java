package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dto.Candidate;
import com.cg.votingapp.entity.CandidateEntity;
import com.cg.votingapp.exceptions.RecordNotFoundException;
import com.cg.votingapp.service.CandidateService;
import com.cg.votingapp.service.CandidateServiceImpl;

public class VotingAppAdministratorService {
	private static Logger logger = LogManager.getLogger(VotingAppAdministratorService.class.getName());
	CandidateService candidateService = new CandidateServiceImpl();
	
	public Candidate addCandidate(Candidate candidate)
	{
		logger.info("Adding Candidate");
		Candidate c=candidateService.addCandidate(candidate);
	    return c;
	}

}
