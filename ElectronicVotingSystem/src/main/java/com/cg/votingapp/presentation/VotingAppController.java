package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.service.ElectionServiceCastVote;
import com.cg.votingapp.service.ElectionServiceCastVoteImpl;



public class VotingAppController {
	
	private static Logger logger = LogManager.getLogger(VotingAppController.class.getName());
	ElectionServiceCastVote electionServices=new ElectionServiceCastVoteImpl();
	
	public void castVote(int candidateId) throws CandidateNotFoundException {
		logger.info("Casting vote");
		try {
			electionServices.castVote(candidateId);
		}
		catch(Exception e) {
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
	}
}