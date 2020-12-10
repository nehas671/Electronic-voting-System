package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.ElectionCastVoteDAO;
import com.cg.votingapp.dao.ElectionCastVoteDAOImpl;
import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;

//Service Class for CastVote
public class ElectionServiceCastVoteImpl implements ElectionServiceCastVote
{	
	private static Logger logger; 
	ElectionCastVoteDAO electionDao = new ElectionCastVoteDAOImpl();
	
	public Boolean castVote(int electionId,int candidateId) throws CandidateNotFoundException,ElectionNotFoundException, InvalidInputException
	{	
		logger = LogManager.getLogger(ElectionServiceCastVoteImpl.class.getName());
		logger.info("Cast Vote Service");
		return electionDao.castVote(electionId, candidateId);	
	}
}