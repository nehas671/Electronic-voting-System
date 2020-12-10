package com.cg.votingapp.service;

import com.cg.votingapp.exceptions.CandidateNotFoundException;
import com.cg.votingapp.exceptions.ElectionNotFoundException;
import com.cg.votingapp.exceptions.InvalidInputException;

public interface ElectionServiceCastVote
{	
	Boolean castVote(int electionId,int candidateId) throws CandidateNotFoundException, ElectionNotFoundException, InvalidInputException;
}
