package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.service.ElectionServiceCastVote;
import com.cg.votingapp.service.ElectionServiceCastVoteImpl;

public class VotingAppController
{	
	private static Logger logger = LogManager.getLogger(VotingAppController.class.getName());
	ElectionServiceCastVote electionService=new ElectionServiceCastVoteImpl();
	
	public Boolean castVote(int candidateId) throws CandidateNotFoundException
	{
		Boolean voted=false;
		logger.info("Casting vote");
		try
		{
			voted=electionService.castVote(candidateId);;
		}
		catch(Exception e)
		{
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		return voted;
	}
}