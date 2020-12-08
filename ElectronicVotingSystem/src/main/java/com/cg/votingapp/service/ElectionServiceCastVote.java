package com.cg.votingapp.service;

import com.cg.votingapp.exception.CandidateNotFoundException;

public interface ElectionServiceCastVote {
	
	void castVote() throws CandidateNotFoundException;
}
