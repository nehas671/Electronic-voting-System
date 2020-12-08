package com.cg.votingapp.service;

import com.cg.votingapp.exceptions.CandidateNotFoundException;

public interface ElectionServiceCastVote
{	
	Boolean castVote(int candidateId) throws CandidateNotFoundException;
}
