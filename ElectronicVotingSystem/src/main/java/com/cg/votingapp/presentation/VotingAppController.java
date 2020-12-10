package com.cg.votingapp.presentation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;
import com.cg.votingapp.service.ElectionServiceCastVote;
import com.cg.votingapp.service.ElectionServiceCastVoteImpl;
//Controller Class for CastVote
public class VotingAppController
{	
	private static Logger logger = LogManager.getLogger(VotingAppController.class.getName());
	ElectionServiceCastVote electionService=new ElectionServiceCastVoteImpl();
	
	public Boolean castVote(int electionId,int candidateId) throws CandidateNotFoundException, ElectionNotFoundException, InvalidInputException
	{
		Boolean voted=false;
		logger.info("Cast vote Controller");
		try
		{
			voted=electionService.castVote(electionId, candidateId );
		}
		catch(CandidateNotFoundException e)
		{
			logger.error("CandidateNotFoundException: " + e);
			throw new CandidateNotFoundException(e.getMessage());
		}
		catch(ElectionNotFoundException e)
		{
			logger.error("ElectionNotFoundException: " + e);
			throw new ElectionNotFoundException(e.getMessage());
		}
		catch(InvalidInputException e)
		{
			logger.error("InvalidInputException: " + e);
			throw new InvalidInputException(e.getMessage());
		}
		return voted;
	}
}