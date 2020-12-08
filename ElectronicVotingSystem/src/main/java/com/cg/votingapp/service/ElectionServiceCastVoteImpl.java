package com.cg.votingapp.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cg.votingapp.dao.ElectionCastVoteDAO;
import com.cg.votingapp.dao.ElectionCastVoteDAOImpl;
import com.cg.votingapp.dao.ElectionCastVoteDAO;
import com.cg.votingapp.exception.CandidateNotFoundException;

public class ElectionServiceCastVoteImpl implements ElectionServiceCastVote{
	
	private static Logger logger; 
	ElectionCastVoteDAO electionDao = new ElectionCastVoteDAOImpl();
	public void castVote() throws CandidateNotFoundException {
		
		logger = LogManager.getLogger(ElectionServiceCastVoteImpl.class.getName());
		logger.info("Cast Vote");
		electionDao.castVote();
		
	}

}
